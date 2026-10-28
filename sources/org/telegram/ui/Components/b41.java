package org.telegram.ui.Components;
public final class b41 {
    public static final b41 f26730a;
    public static final b41 f26731b;
    public static final b41 f26732c;
    public static final b41[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f26730a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f26731b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f26732c = r32;
        d = new b41[]{r02, r12, r32};
    }

    public static b41 valueOf(String str) {
        return (b41) Enum.valueOf(b41.class, str);
    }

    public static b41[] values() {
        return (b41[]) d.clone();
    }
}
