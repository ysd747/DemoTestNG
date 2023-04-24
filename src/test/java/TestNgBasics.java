import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	// PRECONDITIONS ANNOTATION
	@BeforeSuite // Executing 1st
	public void setupsys() {
		System.out.println("Set System Properties");
	}

	@BeforeTest // 2nd Execution Step
	public void launchbrowser() {
		System.out.println("Lauch Chrome Browser");
	}

	@BeforeClass // 3rd Execution Step
	public void enterurl() {
		System.out.println("Enter URL");
	}

	@BeforeMethod // 4th Execution Step
	public void login() {
		System.out.println("Login Page");
	}

	// TEST CASES    5th Execution Step
	@Test // All the test cases will be executed
	public void testpage() {
		System.out.println("Google Title Test");
	}

	@Test
	public void detectmousemovement() {
		System.out.println("Detect Mouse Movement");
	}

	// POST CONDITIONS ANNOTATIONS
	@AfterMethod  // 6th Execution Step
	public void logout() {
		System.out.println("Log Out from App");
	}

	@AfterClass // 7th Execution Step 
	public void deletecoockies() {
		System.out.println("Delete All the Coockies");
	}

	@AfterTest // 8th Execution Step
	public void closebrowser() {
		System.out.println("Close Chrome Browser");
	}

	@AfterSuite //  9th Execution Step
	public void generatetestreports() {
		System.out.println("Generate Test Reports");
	}

}
