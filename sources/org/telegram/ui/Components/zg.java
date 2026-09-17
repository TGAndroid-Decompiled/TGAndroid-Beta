package org.telegram.ui.Components;
public final class zg {
    public static final zg f33150a;
    public static final zg f33151b;
    public static final zg f33152c;
    public static final zg d;
    public static final zg f33153e;
    public static final zg f33154f;
    public static final zg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f33150a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f33151b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f33152c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f33153e = r72;
        ?? r92 = new Enum("GIF", 5);
        f33154f = r92;
        h = new zg[]{r02, r12, r32, r52, r72, r92};
    }

    public static zg valueOf(String str) {
        return (zg) Enum.valueOf(zg.class, str);
    }

    public static zg[] values() {
        return (zg[]) h.clone();
    }
}
