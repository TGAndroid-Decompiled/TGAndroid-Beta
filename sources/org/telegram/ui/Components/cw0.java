package org.telegram.ui.Components;
public final class cw0 {
    public static final cw0 f25479a;
    public static final cw0 f25480b;
    public static final cw0[] f25481c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f25479a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f25480b = r12;
        f25481c = new cw0[]{r02, r12};
    }

    public static cw0 valueOf(String str) {
        return (cw0) Enum.valueOf(cw0.class, str);
    }

    public static cw0[] values() {
        return (cw0[]) f25481c.clone();
    }
}
