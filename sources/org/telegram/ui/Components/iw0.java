package org.telegram.ui.Components;
public final class iw0 {
    public static final iw0 f27462a;
    public static final iw0 f27463b;
    public static final iw0[] f27464c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f27462a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f27463b = r12;
        f27464c = new iw0[]{r02, r12};
    }

    public static iw0 valueOf(String str) {
        return (iw0) Enum.valueOf(iw0.class, str);
    }

    public static iw0[] values() {
        return (iw0[]) f27464c.clone();
    }
}
