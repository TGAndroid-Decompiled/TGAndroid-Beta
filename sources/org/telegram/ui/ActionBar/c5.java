package org.telegram.ui.ActionBar;
public final class c5 {
    public static final c5 f20793a;
    public static final c5 f20794b;
    public static final c5[] f20795c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f20793a = r02;
        ?? r12 = new Enum("MENU", 1);
        f20794b = r12;
        f20795c = new c5[]{r02, r12};
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) f20795c.clone();
    }
}
