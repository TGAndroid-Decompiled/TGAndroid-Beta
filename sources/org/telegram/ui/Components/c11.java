package org.telegram.ui.Components;
public final class c11 {
    public static final c11 f32360a;
    public static final c11 f32361b;
    public static final c11 f32362c;
    public static final c11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f32360a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f32361b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f32362c = r32;
        d = new c11[]{r02, r12, r32};
    }

    public static c11 valueOf(String str) {
        return (c11) Enum.valueOf(c11.class, str);
    }

    public static c11[] values() {
        return (c11[]) d.clone();
    }
}
