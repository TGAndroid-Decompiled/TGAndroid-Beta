package org.telegram.ui.Components;
public final class gw0 {
    public static final gw0 f28731a;
    public static final gw0 f28732b;
    public static final gw0[] f28733c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f28731a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f28732b = r12;
        f28733c = new gw0[]{r02, r12};
    }

    public static gw0 valueOf(String str) {
        return (gw0) Enum.valueOf(gw0.class, str);
    }

    public static gw0[] values() {
        return (gw0[]) f28733c.clone();
    }
}
