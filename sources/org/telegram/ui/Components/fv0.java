package org.telegram.ui.Components;
public final class fv0 {
    public static final fv0 f24015a;
    public static final fv0 f24016b;
    public static final fv0[] f24017c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f24015a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f24016b = r12;
        f24017c = new fv0[]{r02, r12};
    }

    public static fv0 valueOf(String str) {
        return (fv0) Enum.valueOf(fv0.class, str);
    }

    public static fv0[] values() {
        return (fv0[]) f24017c.clone();
    }
}
