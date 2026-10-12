package org.telegram.ui.Components;
public final class d41 {
    public static final d41 f25238a;
    public static final d41 f25239b;
    public static final d41 f25240c;
    public static final d41[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f25238a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f25239b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f25240c = r32;
        d = new d41[]{r02, r12, r32};
    }

    public static d41 valueOf(String str) {
        return (d41) Enum.valueOf(d41.class, str);
    }

    public static d41[] values() {
        return (d41[]) d.clone();
    }
}
