package org.telegram.ui.Components;
public final class og {
    public static final og f31380a;
    public static final og f31381b;
    public static final og f31382c;
    public static final og d;
    public static final og f31383e;
    public static final og f31384f;
    public static final og[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f31380a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f31381b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f31382c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f31383e = r72;
        ?? r92 = new Enum("GIF", 5);
        f31384f = r92;
        h = new og[]{r02, r12, r32, r52, r72, r92};
    }

    public static og valueOf(String str) {
        return (og) Enum.valueOf(og.class, str);
    }

    public static og[] values() {
        return (og[]) h.clone();
    }
}
