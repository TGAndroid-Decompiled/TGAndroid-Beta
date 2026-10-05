package org.telegram.ui.Components;
public final class s31 {
    public static final s31 f30677a;
    public static final s31 f30678b;
    public static final s31 f30679c;
    public static final s31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f30677a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f30678b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f30679c = r32;
        d = new s31[]{r02, r12, r32};
    }

    public static s31 valueOf(String str) {
        return (s31) Enum.valueOf(s31.class, str);
    }

    public static s31[] values() {
        return (s31[]) d.clone();
    }
}
