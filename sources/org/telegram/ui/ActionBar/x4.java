package org.telegram.ui.ActionBar;
public final class x4 {
    public static final x4 f19926a;
    public static final x4 f19927b;
    public static final x4[] f19928c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f19926a = r02;
        ?? r12 = new Enum("MENU", 1);
        f19927b = r12;
        f19928c = new x4[]{r02, r12};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f19928c.clone();
    }
}
