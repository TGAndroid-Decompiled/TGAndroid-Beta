package org.telegram.ui.Components;
public final class og {
    public static final og f29747a;
    public static final og f29748b;
    public static final og f29749c;
    public static final og d;
    public static final og f29750e;
    public static final og f29751f;
    public static final og[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f29747a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f29748b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f29749c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f29750e = r72;
        ?? r92 = new Enum("GIF", 5);
        f29751f = r92;
        h = new og[]{r02, r12, r32, r52, r72, r92};
    }

    public static og valueOf(String str) {
        return (og) Enum.valueOf(og.class, str);
    }

    public static og[] values() {
        return (og[]) h.clone();
    }
}
