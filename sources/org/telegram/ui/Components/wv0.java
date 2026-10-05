package org.telegram.ui.Components;
public final class wv0 {
    public static final wv0 f32720a;
    public static final wv0 f32721b;
    public static final wv0[] f32722c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f32720a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f32721b = r12;
        f32722c = new wv0[]{r02, r12};
    }

    public static wv0 valueOf(String str) {
        return (wv0) Enum.valueOf(wv0.class, str);
    }

    public static wv0[] values() {
        return (wv0[]) f32722c.clone();
    }
}
