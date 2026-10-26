package org.telegram.ui.Components;
public final class gw0 {
    public static final gw0 f28733a;
    public static final gw0 f28734b;
    public static final gw0[] f28735c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f28733a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f28734b = r12;
        f28735c = new gw0[]{r02, r12};
    }

    public static gw0 valueOf(String str) {
        return (gw0) Enum.valueOf(gw0.class, str);
    }

    public static gw0[] values() {
        return (gw0[]) f28735c.clone();
    }
}
