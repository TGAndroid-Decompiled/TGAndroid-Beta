package org.telegram.ui.Components;
public final class og {
    public static final og f29748a;
    public static final og f29749b;
    public static final og f29750c;
    public static final og d;
    public static final og f29751e;
    public static final og f29752f;
    public static final og[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f29748a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f29749b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f29750c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f29751e = r72;
        ?? r92 = new Enum("GIF", 5);
        f29752f = r92;
        h = new og[]{r02, r12, r32, r52, r72, r92};
    }

    public static og valueOf(String str) {
        return (og) Enum.valueOf(og.class, str);
    }

    public static og[] values() {
        return (og[]) h.clone();
    }
}
