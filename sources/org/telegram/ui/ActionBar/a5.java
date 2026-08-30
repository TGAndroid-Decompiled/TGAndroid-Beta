package org.telegram.ui.ActionBar;
public final class a5 {
    public static final a5 f19515a;
    public static final a5 f19516b;
    public static final a5[] f19517c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f19515a = r02;
        ?? r12 = new Enum("MENU", 1);
        f19516b = r12;
        f19517c = new a5[]{r02, r12};
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) f19517c.clone();
    }
}
