package org.telegram.ui.Components;
public final class dw0 {
    public static final dw0 f24496a;
    public static final dw0 f24497b;
    public static final dw0[] f24498c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f24496a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f24497b = r12;
        f24498c = new dw0[]{r02, r12};
    }

    public static dw0 valueOf(String str) {
        return (dw0) Enum.valueOf(dw0.class, str);
    }

    public static dw0[] values() {
        return (dw0[]) f24498c.clone();
    }
}
