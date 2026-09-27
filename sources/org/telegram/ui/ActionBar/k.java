package org.telegram.ui.ActionBar;
public final class k {
    public static final k f19515a;
    public static final k f19516b;
    public static final k f19517c;
    public static final k[] d;

    static {
        ?? r02 = new Enum("FLAT", 0);
        f19515a = r02;
        Enum r12 = new Enum("GLASS_BUTTON", 1);
        ?? r32 = new Enum("GLASS_FULL", 2);
        f19516b = r32;
        ?? r52 = new Enum("BLUR", 3);
        f19517c = r52;
        d = new k[]{r02, r12, r32, r52};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) d.clone();
    }
}
