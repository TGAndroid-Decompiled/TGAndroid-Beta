package org.telegram.ui.Components;
public final class j11 {
    public static final j11 f34906a;
    public static final j11 f34907b;
    public static final j11 f34908c;
    public static final j11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f34906a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f34907b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f34908c = r32;
        d = new j11[]{r02, r12, r32};
    }

    public static j11 valueOf(String str) {
        return (j11) Enum.valueOf(j11.class, str);
    }

    public static j11[] values() {
        return (j11[]) d.clone();
    }
}
