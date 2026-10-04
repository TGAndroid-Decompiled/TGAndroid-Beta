package org.telegram.ui.Components;
public final class vv0 {
    public static final vv0 f32361a;
    public static final vv0 f32362b;
    public static final vv0[] f32363c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f32361a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f32362b = r12;
        f32363c = new vv0[]{r02, r12};
    }

    public static vv0 valueOf(String str) {
        return (vv0) Enum.valueOf(vv0.class, str);
    }

    public static vv0[] values() {
        return (vv0[]) f32363c.clone();
    }
}
