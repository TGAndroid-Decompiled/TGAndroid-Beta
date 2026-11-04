package org.telegram.ui.ActionBar;
public final class m3 {
    public static final m3 f28337a;
    public static final m3 f28338b;
    public static final m3 f28339c;
    public static final m3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f28337a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f28338b = r12;
        ?? r32 = new Enum("FULL", 2);
        f28339c = r32;
        d = new m3[]{r02, r12, r32};
    }

    public static m3 valueOf(String str) {
        return (m3) Enum.valueOf(m3.class, str);
    }

    public static m3[] values() {
        return (m3[]) d.clone();
    }
}
