package org.telegram.ui.Components;
public final class l31 {
    public static final l31 f28065a;
    public static final l31 f28066b;
    public static final l31 f28067c;
    public static final l31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f28065a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f28066b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f28067c = r32;
        d = new l31[]{r02, r12, r32};
    }

    public static l31 valueOf(String str) {
        return (l31) Enum.valueOf(l31.class, str);
    }

    public static l31[] values() {
        return (l31[]) d.clone();
    }
}
