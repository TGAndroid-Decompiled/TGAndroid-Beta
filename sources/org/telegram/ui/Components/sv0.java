package org.telegram.ui.Components;
public final class sv0 {
    public static final sv0 f28356a;
    public static final sv0 f28357b;
    public static final sv0[] f28358c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f28356a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f28357b = r12;
        f28358c = new sv0[]{r02, r12};
    }

    public static sv0 valueOf(String str) {
        return (sv0) Enum.valueOf(sv0.class, str);
    }

    public static sv0[] values() {
        return (sv0[]) f28358c.clone();
    }
}
