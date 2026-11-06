package org.telegram.ui.Components;
public final class hg {
    public static final hg f34311a;
    public static final hg f34312b;
    public static final hg f34313c;
    public static final hg d;
    public static final hg f34314e;
    public static final hg f34315f;
    public static final hg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f34311a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f34312b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f34313c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f34314e = r72;
        ?? r92 = new Enum("GIF", 5);
        f34315f = r92;
        h = new hg[]{r02, r12, r32, r52, r72, r92};
    }

    public static hg valueOf(String str) {
        return (hg) Enum.valueOf(hg.class, str);
    }

    public static hg[] values() {
        return (hg[]) h.clone();
    }
}
