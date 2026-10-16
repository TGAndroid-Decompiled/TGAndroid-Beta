package org.telegram.ui.ActionBar;
public final class x4 {
    public static final x4 f20513a;
    public static final x4 f20514b;
    public static final x4[] f20515c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f20513a = r02;
        ?? r12 = new Enum("MENU", 1);
        f20514b = r12;
        f20515c = new x4[]{r02, r12};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f20515c.clone();
    }
}
