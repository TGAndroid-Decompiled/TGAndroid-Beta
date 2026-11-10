package org.telegram.ui.ActionBar;
public final class b5 {
    public static final b5 f27352a;
    public static final b5 f27353b;
    public static final b5[] f27354c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f27352a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f27353b = r12;
        f27354c = new b5[]{r02, r12};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) f27354c.clone();
    }
}
