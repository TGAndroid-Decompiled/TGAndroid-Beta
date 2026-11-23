package org.telegram.ui.Components;
public final class yg {
    public static final yg f42407a;
    public static final yg f42408b;
    public static final yg f42409c;
    public static final yg d;
    public static final yg f42410e;
    public static final yg f42411f;
    public static final yg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f42407a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f42408b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f42409c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f42410e = r72;
        ?? r92 = new Enum("GIF", 5);
        f42411f = r92;
        h = new yg[]{r02, r12, r32, r52, r72, r92};
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) h.clone();
    }
}
