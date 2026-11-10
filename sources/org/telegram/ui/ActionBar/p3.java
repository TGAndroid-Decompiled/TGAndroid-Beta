package org.telegram.ui.ActionBar;
public final class p3 {
    public static final p3 f28376a;
    public static final p3 f28377b;
    public static final p3 f28378c;
    public static final p3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f28376a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f28377b = r12;
        ?? r32 = new Enum("FULL", 2);
        f28378c = r32;
        d = new p3[]{r02, r12, r32};
    }

    public static p3 valueOf(String str) {
        return (p3) Enum.valueOf(p3.class, str);
    }

    public static p3[] values() {
        return (p3[]) d.clone();
    }
}
