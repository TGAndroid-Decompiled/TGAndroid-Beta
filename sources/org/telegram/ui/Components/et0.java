package org.telegram.ui.Components;
public final class et0 {
    public static final et0 f33494a;
    public static final et0 f33495b;
    public static final et0[] f33496c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f33494a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f33495b = r12;
        f33496c = new et0[]{r02, r12};
    }

    public static et0 valueOf(String str) {
        return (et0) Enum.valueOf(et0.class, str);
    }

    public static et0[] values() {
        return (et0[]) f33496c.clone();
    }
}
