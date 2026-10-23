package org.telegram.ui.Components;
public final class dw0 {
    public static final dw0 f25746a;
    public static final dw0 f25747b;
    public static final dw0[] f25748c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f25746a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f25747b = r12;
        f25748c = new dw0[]{r02, r12};
    }

    public static dw0 valueOf(String str) {
        return (dw0) Enum.valueOf(dw0.class, str);
    }

    public static dw0[] values() {
        return (dw0[]) f25748c.clone();
    }
}
