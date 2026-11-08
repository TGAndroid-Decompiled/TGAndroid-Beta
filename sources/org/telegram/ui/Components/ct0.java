package org.telegram.ui.Components;
public final class ct0 {
    public static final ct0 f32677a;
    public static final ct0 f32678b;
    public static final ct0[] f32679c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f32677a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f32678b = r12;
        f32679c = new ct0[]{r02, r12};
    }

    public static ct0 valueOf(String str) {
        return (ct0) Enum.valueOf(ct0.class, str);
    }

    public static ct0[] values() {
        return (ct0[]) f32679c.clone();
    }
}
