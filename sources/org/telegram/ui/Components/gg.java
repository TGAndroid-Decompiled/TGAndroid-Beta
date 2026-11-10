package org.telegram.ui.Components;
public final class gg {
    public static final gg f33889a;
    public static final gg f33890b;
    public static final gg f33891c;
    public static final gg d;
    public static final gg f33892e;
    public static final gg f33893f;
    public static final gg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f33889a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f33890b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f33891c = r32;
        ?? r52 = new Enum("KEYBOARD", 3);
        d = r52;
        ?? r72 = new Enum("SMILE", 4);
        f33892e = r72;
        ?? r92 = new Enum("GIF", 5);
        f33893f = r92;
        h = new gg[]{r02, r12, r32, r52, r72, r92};
    }

    public static gg valueOf(String str) {
        return (gg) Enum.valueOf(gg.class, str);
    }

    public static gg[] values() {
        return (gg[]) h.clone();
    }
}
