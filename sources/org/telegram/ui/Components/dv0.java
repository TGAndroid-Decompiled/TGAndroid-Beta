package org.telegram.ui.Components;
public final class dv0 {
    public static final dv0 f25495a;
    public static final dv0 f25496b;
    public static final dv0[] f25497c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f25495a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f25496b = r12;
        f25497c = new dv0[]{r02, r12};
    }

    public static dv0 valueOf(String str) {
        return (dv0) Enum.valueOf(dv0.class, str);
    }

    public static dv0[] values() {
        return (dv0[]) f25497c.clone();
    }
}
