package org.telegram.ui.Components;
public final class dg {
    public static final dg f25480a;
    public static final dg f25481b;
    public static final dg f25482c;
    public static final dg d;
    public static final dg e;
    public static final dg f25483f;
    public static final dg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f25480a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f25481b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f25482c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f25483f = r92;
        h = new dg[]{r02, r12, r32, r52, r72, r92};
    }

    public static dg valueOf(String str) {
        return (dg) Enum.valueOf(dg.class, str);
    }

    public static dg[] values() {
        return (dg[]) h.clone();
    }
}
