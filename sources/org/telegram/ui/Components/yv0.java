package org.telegram.ui.Components;
public final class yv0 {
    public static final yv0 f32760a;
    public static final yv0 f32761b;
    public static final yv0[] f32762c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f32760a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f32761b = r12;
        f32762c = new yv0[]{r02, r12};
    }

    public static yv0 valueOf(String str) {
        return (yv0) Enum.valueOf(yv0.class, str);
    }

    public static yv0[] values() {
        return (yv0[]) f32762c.clone();
    }
}
