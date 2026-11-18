package org.telegram.ui.Components;
public final class wg {
    public static final wg f41708a;
    public static final wg f41709b;
    public static final wg f41710c;
    public static final wg d;
    public static final wg f41711e;
    public static final wg f41712f;
    public static final wg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f41708a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f41709b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f41710c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f41711e = r72;
        ?? r92 = new Enum("GIF", 5);
        f41712f = r92;
        h = new wg[]{r02, r12, r32, r52, r72, r92};
    }

    public static wg valueOf(String str) {
        return (wg) Enum.valueOf(wg.class, str);
    }

    public static wg[] values() {
        return (wg[]) h.clone();
    }
}
