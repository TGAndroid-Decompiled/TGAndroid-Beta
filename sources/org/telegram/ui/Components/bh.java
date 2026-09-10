package org.telegram.ui.Components;
public final class bh {
    public static final bh f21829a;
    public static final bh f21830b;
    public static final bh f21831c;
    public static final bh d;
    public static final bh e;
    public static final bh f21832f;
    public static final bh[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f21829a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f21830b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f21831c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f21832f = r92;
        h = new bh[]{r02, r12, r32, r52, r72, r92};
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) h.clone();
    }
}
