package org.telegram.ui.Components;
public final class qv0 {
    public static final qv0 f27769a;
    public static final qv0 f27770b;
    public static final qv0[] f27771c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f27769a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f27770b = r12;
        f27771c = new qv0[]{r02, r12};
    }

    public static qv0 valueOf(String str) {
        return (qv0) Enum.valueOf(qv0.class, str);
    }

    public static qv0[] values() {
        return (qv0[]) f27771c.clone();
    }
}
