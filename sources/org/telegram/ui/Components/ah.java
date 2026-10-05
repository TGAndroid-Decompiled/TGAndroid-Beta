package org.telegram.ui.Components;
public final class ah {
    public static final ah f24595a;
    public static final ah f24596b;
    public static final ah f24597c;
    public static final ah d;
    public static final ah f24598e;
    public static final ah f24599f;
    public static final ah[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f24595a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f24596b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f24597c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f24598e = r72;
        ?? r92 = new Enum("GIF", 5);
        f24599f = r92;
        h = new ah[]{r02, r12, r32, r52, r72, r92};
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) h.clone();
    }
}
