package org.telegram.ui.Components;
public final class ng {
    public static final ng f37580a;
    public static final ng f37581b;
    public static final ng f37582c;
    public static final ng d;
    public static final ng f37583e;
    public static final ng f37584f;
    public static final ng[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f37580a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f37581b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f37582c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f37583e = r72;
        ?? r92 = new Enum("GIF", 5);
        f37584f = r92;
        h = new ng[]{r02, r12, r32, r52, r72, r92};
    }

    public static ng valueOf(String str) {
        return (ng) Enum.valueOf(ng.class, str);
    }

    public static ng[] values() {
        return (ng[]) h.clone();
    }
}
