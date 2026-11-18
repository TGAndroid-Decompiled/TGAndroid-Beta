package org.telegram.ui.ActionBar;
public final class c5 {
    public static final c5 f28827a;
    public static final c5 f28828b;
    public static final c5[] f28829c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f28827a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f28828b = r12;
        f28829c = new c5[]{r02, r12};
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) f28829c.clone();
    }
}
