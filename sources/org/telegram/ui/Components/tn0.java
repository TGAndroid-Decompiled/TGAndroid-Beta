package org.telegram.ui.Components;
public final class tn0 {
    public static final tn0 f30900a;
    public static final tn0 f30901b;
    public static final tn0[] f30902c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f30900a = r02;
        ?? r12 = new Enum("TAB", 1);
        f30901b = r12;
        f30902c = new tn0[]{r02, r12};
    }

    public static tn0 valueOf(String str) {
        return (tn0) Enum.valueOf(tn0.class, str);
    }

    public static tn0[] values() {
        return (tn0[]) f30902c.clone();
    }
}
