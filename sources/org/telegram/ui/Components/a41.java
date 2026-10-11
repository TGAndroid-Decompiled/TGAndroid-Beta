package org.telegram.ui.Components;
public final class a41 {
    public static final a41 f24432a;
    public static final a41 f24433b;
    public static final a41 f24434c;
    public static final a41[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f24432a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f24433b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f24434c = r32;
        d = new a41[]{r02, r12, r32};
    }

    public static a41 valueOf(String str) {
        return (a41) Enum.valueOf(a41.class, str);
    }

    public static a41[] values() {
        return (a41[]) d.clone();
    }
}
