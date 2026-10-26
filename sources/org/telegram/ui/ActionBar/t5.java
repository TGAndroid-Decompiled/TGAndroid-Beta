package org.telegram.ui.ActionBar;
public final class t5 {
    public static final t5 f23102a;
    public static final t5 f23103b;
    public static final t5[] f23104c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f23102a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f23103b = r12;
        f23104c = new t5[]{r02, r12};
    }

    public static t5 valueOf(String str) {
        return (t5) Enum.valueOf(t5.class, str);
    }

    public static t5[] values() {
        return (t5[]) f23104c.clone();
    }
}
