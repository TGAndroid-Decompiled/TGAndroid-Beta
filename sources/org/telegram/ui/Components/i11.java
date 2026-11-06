package org.telegram.ui.Components;
public final class i11 {
    public static final i11 f34460a;
    public static final i11 f34461b;
    public static final i11 f34462c;
    public static final i11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f34460a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f34461b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f34462c = r32;
        d = new i11[]{r02, r12, r32};
    }

    public static i11 valueOf(String str) {
        return (i11) Enum.valueOf(i11.class, str);
    }

    public static i11[] values() {
        return (i11[]) d.clone();
    }
}
