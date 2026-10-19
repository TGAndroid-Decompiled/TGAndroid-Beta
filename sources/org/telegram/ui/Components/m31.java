package org.telegram.ui.Components;
public final class m31 {
    public static final m31 f28381a;
    public static final m31 f28382b;
    public static final m31 f28383c;
    public static final m31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f28381a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f28382b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f28383c = r32;
        d = new m31[]{r02, r12, r32};
    }

    public static m31 valueOf(String str) {
        return (m31) Enum.valueOf(m31.class, str);
    }

    public static m31[] values() {
        return (m31[]) d.clone();
    }
}
