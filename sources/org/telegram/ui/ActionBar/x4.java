package org.telegram.ui.ActionBar;

public final class x4 {

    public static final x4 f23954a;

    public static final x4 f23955b;

    public static final x4[] f23956c;

    static {
        x4 x4Var = new x4("BACK", 0);
        f23954a = x4Var;
        x4 x4Var2 = new x4("MENU", 1);
        f23955b = x4Var2;
        f23956c = new x4[]{x4Var, x4Var2};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f23956c.clone();
    }
}
