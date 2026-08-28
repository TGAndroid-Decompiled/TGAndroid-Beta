package org.telegram.ui.ActionBar;
public final class x4 {
    public static final x4 f23943a;
    public static final x4 f23944b;
    public static final x4[] f23945c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f23943a = r02;
        ?? r12 = new Enum("MENU", 1);
        f23944b = r12;
        f23945c = new x4[]{r02, r12};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f23945c.clone();
    }
}
