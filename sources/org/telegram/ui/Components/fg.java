package org.telegram.ui.Components;
public final class fg {
    public static final fg f33790a;
    public static final fg f33791b;
    public static final fg f33792c;
    public static final fg d;
    public static final fg f33793e;
    public static final fg f33794f;
    public static final fg[] h;

    static {
        ?? r02 = new Enum("VOICE", 0);
        f33790a = r02;
        ?? r12 = new Enum("VIDEO", 1);
        f33791b = r12;
        ?? r32 = new Enum("STICKER", 2);
        f33792c = r32;
        ?? r5 = new Enum("KEYBOARD", 3);
        d = r5;
        ?? r72 = new Enum("SMILE", 4);
        f33793e = r72;
        ?? r9 = new Enum("GIF", 5);
        f33794f = r9;
        h = new fg[]{r02, r12, r32, r5, r72, r9};
    }

    public static fg valueOf(String str) {
        return (fg) Enum.valueOf(fg.class, str);
    }

    public static fg[] values() {
        return (fg[]) h.clone();
    }
}
