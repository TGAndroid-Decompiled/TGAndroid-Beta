package org.telegram.ui.Components;
public final class hw0 {
    public static final hw0 f27145a;
    public static final hw0 f27146b;
    public static final hw0[] f27147c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f27145a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f27146b = r12;
        f27147c = new hw0[]{r02, r12};
    }

    public static hw0 valueOf(String str) {
        return (hw0) Enum.valueOf(hw0.class, str);
    }

    public static hw0[] values() {
        return (hw0[]) f27147c.clone();
    }
}
