package org.telegram.ui.Components;
public final class ng {
    public static final ng f37569a;
    public static final ng f37570b;
    public static final ng f37571c;
    public static final ng d;
    public static final ng f37572e;
    public static final ng f37573f;
    public static final ng[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f37569a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f37570b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f37571c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f37572e = r72;
        ?? r92 = new Enum("GIF", 5);
        f37573f = r92;
        h = new ng[]{r02, r12, r32, r52, r72, r92};
    }

    public static ng valueOf(String str) {
        return (ng) Enum.valueOf(ng.class, str);
    }

    public static ng[] values() {
        return (ng[]) h.clone();
    }
}
