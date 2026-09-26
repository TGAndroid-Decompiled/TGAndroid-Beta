package org.telegram.ui.Components;
public final class zg {
    public static final zg f30866a;
    public static final zg f30867b;
    public static final zg f30868c;
    public static final zg d;
    public static final zg e;
    public static final zg f30869f;
    public static final zg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f30866a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f30867b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f30868c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f30869f = r92;
        h = new zg[]{r02, r12, r32, r52, r72, r92};
    }

    public static zg valueOf(String str) {
        return (zg) Enum.valueOf(zg.class, str);
    }

    public static zg[] values() {
        return (zg[]) h.clone();
    }
}
