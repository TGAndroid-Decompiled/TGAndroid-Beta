package org.telegram.ui.Components;
public final class dh {
    public static final dh f25353a;
    public static final dh f25354b;
    public static final dh f25355c;
    public static final dh d;
    public static final dh f25356e;
    public static final dh f25357f;
    public static final dh[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f25353a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f25354b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f25355c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f25356e = r72;
        ?? r92 = new Enum("GIF", 5);
        f25357f = r92;
        h = new dh[]{r02, r12, r32, r52, r72, r92};
    }

    public static dh valueOf(String str) {
        return (dh) Enum.valueOf(dh.class, str);
    }

    public static dh[] values() {
        return (dh[]) h.clone();
    }
}
