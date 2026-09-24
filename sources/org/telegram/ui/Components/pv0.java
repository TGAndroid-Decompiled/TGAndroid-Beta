package org.telegram.ui.Components;
public final class pv0 {
    public static final pv0 f27430a;
    public static final pv0 f27431b;
    public static final pv0[] f27432c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f27430a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f27431b = r12;
        f27432c = new pv0[]{r02, r12};
    }

    public static pv0 valueOf(String str) {
        return (pv0) Enum.valueOf(pv0.class, str);
    }

    public static pv0[] values() {
        return (pv0[]) f27432c.clone();
    }
}
