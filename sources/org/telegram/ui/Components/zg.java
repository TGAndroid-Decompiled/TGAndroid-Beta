package org.telegram.ui.Components;
public final class zg {
    public static final zg f33149a;
    public static final zg f33150b;
    public static final zg f33151c;
    public static final zg d;
    public static final zg f33152e;
    public static final zg f33153f;
    public static final zg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f33149a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f33150b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f33151c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f33152e = r72;
        ?? r92 = new Enum("GIF", 5);
        f33153f = r92;
        h = new zg[]{r02, r12, r32, r52, r72, r92};
    }

    public static zg valueOf(String str) {
        return (zg) Enum.valueOf(zg.class, str);
    }

    public static zg[] values() {
        return (zg[]) h.clone();
    }
}
