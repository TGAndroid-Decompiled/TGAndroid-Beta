package org.telegram.ui.Components;
public final class s31 {
    public static final s31 f30369a;
    public static final s31 f30370b;
    public static final s31 f30371c;
    public static final s31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f30369a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f30370b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f30371c = r32;
        d = new s31[]{r02, r12, r32};
    }

    public static s31 valueOf(String str) {
        return (s31) Enum.valueOf(s31.class, str);
    }

    public static s31[] values() {
        return (s31[]) d.clone();
    }
}
