package org.telegram.ui.Components;
public final class v11 {
    public static final v11 f40475a;
    public static final v11 f40476b;
    public static final v11 f40477c;
    public static final v11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f40475a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f40476b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f40477c = r32;
        d = new v11[]{r02, r12, r32};
    }

    public static v11 valueOf(String str) {
        return (v11) Enum.valueOf(v11.class, str);
    }

    public static v11[] values() {
        return (v11[]) d.clone();
    }
}
