package org.telegram.ui.Components;
public final class xg {
    public static final xg f29924a;
    public static final xg f29925b;
    public static final xg f29926c;
    public static final xg d;
    public static final xg e;
    public static final xg f29927f;
    public static final xg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f29924a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f29925b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f29926c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f29927f = r92;
        h = new xg[]{r02, r12, r32, r52, r72, r92};
    }

    public static xg valueOf(String str) {
        return (xg) Enum.valueOf(xg.class, str);
    }

    public static xg[] values() {
        return (xg[]) h.clone();
    }
}
