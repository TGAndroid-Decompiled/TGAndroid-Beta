package org.telegram.ui.Components;
public final class yg {
    public static final yg f30239a;
    public static final yg f30240b;
    public static final yg f30241c;
    public static final yg d;
    public static final yg e;
    public static final yg f30242f;
    public static final yg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f30239a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f30240b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f30241c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f30242f = r92;
        h = new yg[]{r02, r12, r32, r52, r72, r92};
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) h.clone();
    }
}
