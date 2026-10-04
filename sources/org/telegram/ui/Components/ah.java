package org.telegram.ui.Components;
public final class ah {
    public static final ah f24529a;
    public static final ah f24530b;
    public static final ah f24531c;
    public static final ah d;
    public static final ah f24532e;
    public static final ah f24533f;
    public static final ah[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f24529a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f24530b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f24531c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f24532e = r72;
        ?? r92 = new Enum("GIF", 5);
        f24533f = r92;
        h = new ah[]{r02, r12, r32, r52, r72, r92};
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) h.clone();
    }
}
