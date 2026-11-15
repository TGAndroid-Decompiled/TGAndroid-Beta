package org.telegram.ui.Components;
public final class l11 {
    public static final l11 f36700a;
    public static final l11 f36701b;
    public static final l11 f36702c;
    public static final l11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f36700a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f36701b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f36702c = r32;
        d = new l11[]{r02, r12, r32};
    }

    public static l11 valueOf(String str) {
        return (l11) Enum.valueOf(l11.class, str);
    }

    public static l11[] values() {
        return (l11[]) d.clone();
    }
}
