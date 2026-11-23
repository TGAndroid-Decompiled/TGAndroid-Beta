package org.telegram.ui.ActionBar;
public final class n4 {
    public static final n4 f29810a;
    public static final n4 f29811b;
    public static final n4[] f29812c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f29810a = r02;
        ?? r12 = new Enum("MENU", 1);
        f29811b = r12;
        f29812c = new n4[]{r02, r12};
    }

    public static n4 valueOf(String str) {
        return (n4) Enum.valueOf(n4.class, str);
    }

    public static n4[] values() {
        return (n4[]) f29812c.clone();
    }
}
