package org.telegram.ui.Components;
public final class d41 {
    public static final d41 f25230a;
    public static final d41 f25231b;
    public static final d41 f25232c;
    public static final d41[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f25230a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f25231b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f25232c = r32;
        d = new d41[]{r02, r12, r32};
    }

    public static d41 valueOf(String str) {
        return (d41) Enum.valueOf(d41.class, str);
    }

    public static d41[] values() {
        return (d41[]) d.clone();
    }
}
