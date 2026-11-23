package org.telegram.ui.ActionBar;
public final class b5 {
    public static final b5 f28812a;
    public static final b5 f28813b;
    public static final b5[] f28814c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f28812a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f28813b = r12;
        f28814c = new b5[]{r02, r12};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) f28814c.clone();
    }
}
