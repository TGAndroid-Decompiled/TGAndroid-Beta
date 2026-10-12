package org.telegram.ui.Components;
public final class dh {
    public static final dh f25361a;
    public static final dh f25362b;
    public static final dh f25363c;
    public static final dh d;
    public static final dh f25364e;
    public static final dh f25365f;
    public static final dh[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f25361a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f25362b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f25363c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f25364e = r72;
        ?? r92 = new Enum("GIF", 5);
        f25365f = r92;
        h = new dh[]{r02, r12, r32, r52, r72, r92};
    }

    public static dh valueOf(String str) {
        return (dh) Enum.valueOf(dh.class, str);
    }

    public static dh[] values() {
        return (dh[]) h.clone();
    }
}
