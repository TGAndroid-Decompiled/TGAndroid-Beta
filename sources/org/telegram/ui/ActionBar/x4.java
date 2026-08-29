package org.telegram.ui.ActionBar;
public final class x4 {
    public static final x4 f23968a;
    public static final x4 f23969b;
    public static final x4[] f23970c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f23968a = r02;
        ?? r12 = new Enum("MENU", 1);
        f23969b = r12;
        f23970c = new x4[]{r02, r12};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f23970c.clone();
    }
}
