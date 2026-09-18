package org.telegram.ui.Components;
public final class xg {
    public static final xg f29908a;
    public static final xg f29909b;
    public static final xg f29910c;
    public static final xg d;
    public static final xg e;
    public static final xg f29911f;
    public static final xg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f29908a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f29909b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f29910c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f29911f = r92;
        h = new xg[]{r02, r12, r32, r52, r72, r92};
    }

    public static xg valueOf(String str) {
        return (xg) Enum.valueOf(xg.class, str);
    }

    public static xg[] values() {
        return (xg[]) h.clone();
    }
}
