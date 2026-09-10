package org.telegram.ui.ActionBar;
public final class c4 {
    public static final c4 f17572a;
    public static final c4 f17573b;
    public static final c4 f17574c;
    public static final c4[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f17572a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f17573b = r12;
        ?? r32 = new Enum("FULL", 2);
        f17574c = r32;
        d = new c4[]{r02, r12, r32};
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) d.clone();
    }
}
