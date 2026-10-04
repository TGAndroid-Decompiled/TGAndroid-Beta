package org.telegram.ui.Components;
public final class r31 {
    public static final r31 f30266a;
    public static final r31 f30267b;
    public static final r31 f30268c;
    public static final r31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f30266a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f30267b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f30268c = r32;
        d = new r31[]{r02, r12, r32};
    }

    public static r31 valueOf(String str) {
        return (r31) Enum.valueOf(r31.class, str);
    }

    public static r31[] values() {
        return (r31[]) d.clone();
    }
}
