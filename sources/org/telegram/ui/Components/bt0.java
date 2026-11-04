package org.telegram.ui.Components;
public final class bt0 {
    public static final bt0 f32393a;
    public static final bt0 f32394b;
    public static final bt0[] f32395c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f32393a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f32394b = r12;
        f32395c = new bt0[]{r02, r12};
    }

    public static bt0 valueOf(String str) {
        return (bt0) Enum.valueOf(bt0.class, str);
    }

    public static bt0[] values() {
        return (bt0[]) f32395c.clone();
    }
}
