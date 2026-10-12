package org.telegram.ui.Components;
public final class nw0 {
    public static final nw0 f28977a;
    public static final nw0 f28978b;
    public static final nw0[] f28979c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f28977a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f28978b = r12;
        f28979c = new nw0[]{r02, r12};
    }

    public static nw0 valueOf(String str) {
        return (nw0) Enum.valueOf(nw0.class, str);
    }

    public static nw0[] values() {
        return (nw0[]) f28979c.clone();
    }
}
