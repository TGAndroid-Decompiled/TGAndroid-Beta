package org.telegram.ui.Components;
public final class yg {
    public static final yg f32615a;
    public static final yg f32616b;
    public static final yg f32617c;
    public static final yg d;
    public static final yg e;
    public static final yg f32618f;
    public static final yg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f32615a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f32616b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f32617c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f32618f = r92;
        h = new yg[]{r02, r12, r32, r52, r72, r92};
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) h.clone();
    }
}
