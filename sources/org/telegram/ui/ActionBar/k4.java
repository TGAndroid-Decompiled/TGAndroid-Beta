package org.telegram.ui.ActionBar;
public final class k4 {
    public static final k4 f29337a;
    public static final k4 f29338b;
    public static final k4[] f29339c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f29337a = r02;
        ?? r12 = new Enum("MENU", 1);
        f29338b = r12;
        f29339c = new k4[]{r02, r12};
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) f29339c.clone();
    }
}
