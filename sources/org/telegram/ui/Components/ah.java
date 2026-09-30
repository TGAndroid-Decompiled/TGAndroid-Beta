package org.telegram.ui.Components;
public final class ah {
    public static final ah f22625a;
    public static final ah f22626b;
    public static final ah f22627c;
    public static final ah d;
    public static final ah e;
    public static final ah f22628f;
    public static final ah[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f22625a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f22626b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f22627c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        e = r72;
        ?? r92 = new Enum("GIF", 5);
        f22628f = r92;
        h = new ah[]{r02, r12, r32, r52, r72, r92};
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) h.clone();
    }
}
