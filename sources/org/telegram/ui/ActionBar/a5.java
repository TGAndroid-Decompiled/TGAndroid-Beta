package org.telegram.ui.ActionBar;
public final class a5 {
    public static final a5 f27327a;
    public static final a5 f27328b;
    public static final a5[] f27329c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f27327a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f27328b = r12;
        f27329c = new a5[]{r02, r12};
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) f27329c.clone();
    }
}
