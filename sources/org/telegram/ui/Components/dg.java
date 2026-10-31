package org.telegram.ui.Components;
public final class dg {
    public static final dg f25405a;
    public static final dg f25406b;
    public static final dg f25407c;
    public static final dg d;
    public static final dg e;
    public static final dg f25408f;
    public static final dg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f25405a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f25406b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f25407c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f25408f = r92;
        h = new dg[]{r02, r12, r32, r52, r72, r92};
    }

    public static dg valueOf(String str) {
        return (dg) Enum.valueOf(dg.class, str);
    }

    public static dg[] values() {
        return (dg[]) h.clone();
    }
}
