package org.telegram.ui.Components;
public final class fv0 {
    public static final fv0 f27022a;
    public static final fv0 f27023b;
    public static final fv0[] f27024c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f27022a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f27023b = r12;
        f27024c = new fv0[]{r02, r12};
    }

    public static fv0 valueOf(String str) {
        return (fv0) Enum.valueOf(fv0.class, str);
    }

    public static fv0[] values() {
        return (fv0[]) f27024c.clone();
    }
}
