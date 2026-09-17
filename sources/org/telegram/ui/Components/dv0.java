package org.telegram.ui.Components;
public final class dv0 {
    public static final dv0 f25496a;
    public static final dv0 f25497b;
    public static final dv0[] f25498c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f25496a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f25497b = r12;
        f25498c = new dv0[]{r02, r12};
    }

    public static dv0 valueOf(String str) {
        return (dv0) Enum.valueOf(dv0.class, str);
    }

    public static dv0[] values() {
        return (dv0[]) f25498c.clone();
    }
}
