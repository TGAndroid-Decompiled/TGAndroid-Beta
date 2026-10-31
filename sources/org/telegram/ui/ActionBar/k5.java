package org.telegram.ui.ActionBar;
public final class k5 {
    public static final k5 f20465a;
    public static final k5 f20466b;
    public static final k5[] f20467c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f20465a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f20466b = r12;
        f20467c = new k5[]{r02, r12};
    }

    public static k5 valueOf(String str) {
        return (k5) Enum.valueOf(k5.class, str);
    }

    public static k5[] values() {
        return (k5[]) f20467c.clone();
    }
}
