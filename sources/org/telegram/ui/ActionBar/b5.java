package org.telegram.ui.ActionBar;
public final class b5 {
    public static final b5 f21197a;
    public static final b5 f21198b;
    public static final b5[] f21199c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f21197a = r02;
        ?? r12 = new Enum("MENU", 1);
        f21198b = r12;
        f21199c = new b5[]{r02, r12};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) f21199c.clone();
    }
}
