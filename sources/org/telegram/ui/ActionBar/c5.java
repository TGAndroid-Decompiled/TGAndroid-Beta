package org.telegram.ui.ActionBar;
public final class c5 {
    public static final c5 f28829a;
    public static final c5 f28830b;
    public static final c5[] f28831c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f28829a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f28830b = r12;
        f28831c = new c5[]{r02, r12};
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) f28831c.clone();
    }
}
