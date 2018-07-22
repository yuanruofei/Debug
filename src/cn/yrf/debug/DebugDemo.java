package cn.yrf.debug;

public class DebugDemo {
	public static void main(String[] args) {
		int moneyEachDay = 0;
		int day = 10;
		int sum = 0;
		for (int i = 1; i < day; i++) {
			if (0 == moneyEachDay) {
				moneyEachDay = 1;

			} else {
				moneyEachDay *= 2;
			}
			sum += moneyEachDay;
			System.out.println(i + "天之后,tom手中的钱数是:" + sum);

		}
	}

}
