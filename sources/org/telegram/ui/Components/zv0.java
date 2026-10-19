package org.telegram.ui.Components;
public final class zv0 {
    public static final zv0 f33044a;
    public static final zv0 f33045b;
    public static final zv0[] f33046c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f33044a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f33045b = r12;
        f33046c = new zv0[]{r02, r12};
    }

    public static zv0 valueOf(String str) {
        return (zv0) Enum.valueOf(zv0.class, str);
    }

    public static zv0[] values() {
        return (zv0[]) f33046c.clone();
    }
}
