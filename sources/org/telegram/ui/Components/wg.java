package org.telegram.ui.Components;
public final class wg {
    public static final wg f32230a;
    public static final wg f32231b;
    public static final wg f32232c;
    public static final wg d;
    public static final wg e;
    public static final wg f32233f;
    public static final wg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f32230a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f32231b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f32232c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f32233f = r92;
        h = new wg[]{r02, r12, r32, r52, r72, r92};
    }

    public static wg valueOf(String str) {
        return (wg) Enum.valueOf(wg.class, str);
    }

    public static wg[] values() {
        return (wg[]) h.clone();
    }
}
