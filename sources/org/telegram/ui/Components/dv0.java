package org.telegram.ui.Components;
public final class dv0 {
    public static final dv0 f25468a;
    public static final dv0 f25469b;
    public static final dv0[] f25470c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f25468a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f25469b = r12;
        f25470c = new dv0[]{r02, r12};
    }

    public static dv0 valueOf(String str) {
        return (dv0) Enum.valueOf(dv0.class, str);
    }

    public static dv0[] values() {
        return (dv0[]) f25470c.clone();
    }
}
