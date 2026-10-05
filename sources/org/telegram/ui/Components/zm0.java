package org.telegram.ui.Components;
public final class zm0 {
    public static final zm0 f33584a;
    public static final zm0 f33585b;
    public static final zm0[] f33586c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f33584a = r02;
        ?? r12 = new Enum("TAB", 1);
        f33585b = r12;
        f33586c = new zm0[]{r02, r12};
    }

    public static zm0 valueOf(String str) {
        return (zm0) Enum.valueOf(zm0.class, str);
    }

    public static zm0[] values() {
        return (zm0[]) f33586c.clone();
    }
}
