package org.telegram.ui.Components;
public final class vm0 {
    public static final vm0 f29156a;
    public static final vm0 f29157b;
    public static final vm0[] f29158c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f29156a = r02;
        ?? r12 = new Enum("TAB", 1);
        f29157b = r12;
        f29158c = new vm0[]{r02, r12};
    }

    public static vm0 valueOf(String str) {
        return (vm0) Enum.valueOf(vm0.class, str);
    }

    public static vm0[] values() {
        return (vm0[]) f29158c.clone();
    }
}
