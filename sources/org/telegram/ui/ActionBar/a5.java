package org.telegram.ui.ActionBar;
public final class a5 {
    public static final a5 f19490a;
    public static final a5 f19491b;
    public static final a5[] f19492c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f19490a = r02;
        ?? r12 = new Enum("MENU", 1);
        f19491b = r12;
        f19492c = new a5[]{r02, r12};
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) f19492c.clone();
    }
}
