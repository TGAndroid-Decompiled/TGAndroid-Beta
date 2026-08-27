package org.telegram.ui.ActionBar;

public final class y3 {

    public static final y3 f23971a;

    public static final y3 f23972b;

    public static final y3 f23973c;
    public static final y3[] d;

    static {
        y3 y3Var = new y3("NONE", 0);
        f23971a = y3Var;
        y3 y3Var2 = new y3("VERTICAL", 1);
        f23972b = y3Var2;
        y3 y3Var3 = new y3("FULL", 2);
        f23973c = y3Var3;
        d = new y3[]{y3Var, y3Var2, y3Var3};
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) d.clone();
    }
}
