package org.telegram.ui.Components;
public final class hg {
    public static final hg f34323a;
    public static final hg f34324b;
    public static final hg f34325c;
    public static final hg d;
    public static final hg f34326e;
    public static final hg f34327f;
    public static final hg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f34323a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f34324b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f34325c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f34326e = r72;
        ?? r92 = new Enum("GIF", 5);
        f34327f = r92;
        h = new hg[]{r02, r12, r32, r52, r72, r92};
    }

    public static hg valueOf(String str) {
        return (hg) Enum.valueOf(hg.class, str);
    }

    public static hg[] values() {
        return (hg[]) h.clone();
    }
}
