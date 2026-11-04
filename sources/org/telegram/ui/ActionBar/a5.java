package org.telegram.ui.ActionBar;
public final class a5 {
    public static final a5 f27378a;
    public static final a5 f27379b;
    public static final a5[] f27380c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f27378a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f27379b = r12;
        f27380c = new a5[]{r02, r12};
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) f27380c.clone();
    }
}
