package org.telegram.ui.Components;
public final class rg {
    public static final rg f32293a;
    public static final rg f32294b;
    public static final rg f32295c;
    public static final rg d;
    public static final rg f32296e;
    public static final rg f32297f;
    public static final rg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f32293a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f32294b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f32295c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f32296e = r72;
        ?? r9 = new Enum("GIF", 5);
        f32297f = r9;
        h = new rg[]{r02, r12, r32, r52, r72, r9};
    }

    public static rg valueOf(String str) {
        return (rg) Enum.valueOf(rg.class, str);
    }

    public static rg[] values() {
        return (rg[]) h.clone();
    }
}
