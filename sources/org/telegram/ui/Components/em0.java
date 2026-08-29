package org.telegram.ui.Components;
public final class em0 {
    public static final em0 f28113a;
    public static final em0 f28114b;
    public static final em0[] f28115c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f28113a = r02;
        ?? r12 = new Enum("TAB", 1);
        f28114b = r12;
        f28115c = new em0[]{r02, r12};
    }

    public static em0 valueOf(String str) {
        return (em0) Enum.valueOf(em0.class, str);
    }

    public static em0[] values() {
        return (em0[]) f28115c.clone();
    }
}
