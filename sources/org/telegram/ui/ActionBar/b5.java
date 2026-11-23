package org.telegram.ui.ActionBar;
public final class b5 {
    public static final b5 f28778a;
    public static final b5 f28779b;
    public static final b5[] f28780c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f28778a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f28779b = r12;
        f28780c = new b5[]{r02, r12};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) f28780c.clone();
    }
}
