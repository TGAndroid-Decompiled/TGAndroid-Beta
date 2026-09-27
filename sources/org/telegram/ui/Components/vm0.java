package org.telegram.ui.Components;
public final class vm0 {
    public static final vm0 f29178a;
    public static final vm0 f29179b;
    public static final vm0[] f29180c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f29178a = r02;
        ?? r12 = new Enum("TAB", 1);
        f29179b = r12;
        f29180c = new vm0[]{r02, r12};
    }

    public static vm0 valueOf(String str) {
        return (vm0) Enum.valueOf(vm0.class, str);
    }

    public static vm0[] values() {
        return (vm0[]) f29180c.clone();
    }
}
