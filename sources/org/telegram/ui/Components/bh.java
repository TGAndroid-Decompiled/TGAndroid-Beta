package org.telegram.ui.Components;
public final class bh {
    public static final bh f24955a;
    public static final bh f24956b;
    public static final bh f24957c;
    public static final bh d;
    public static final bh f24958e;
    public static final bh f24959f;
    public static final bh[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f24955a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f24956b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f24957c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f24958e = r72;
        ?? r92 = new Enum("GIF", 5);
        f24959f = r92;
        h = new bh[]{r02, r12, r32, r52, r72, r92};
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) h.clone();
    }
}
