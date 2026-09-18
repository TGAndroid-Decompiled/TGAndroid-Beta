package org.telegram.ui.Components;
public final class qv0 {
    public static final qv0 f27743a;
    public static final qv0 f27744b;
    public static final qv0[] f27745c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f27743a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f27744b = r12;
        f27745c = new qv0[]{r02, r12};
    }

    public static qv0 valueOf(String str) {
        return (qv0) Enum.valueOf(qv0.class, str);
    }

    public static qv0[] values() {
        return (qv0[]) f27745c.clone();
    }
}
