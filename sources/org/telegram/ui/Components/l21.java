package org.telegram.ui.Components;
public final class l21 {
    public static final l21 f28035a;
    public static final l21 f28036b;
    public static final l21 f28037c;
    public static final l21[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f28035a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f28036b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f28037c = r32;
        d = new l21[]{r02, r12, r32};
    }

    public static l21 valueOf(String str) {
        return (l21) Enum.valueOf(l21.class, str);
    }

    public static l21[] values() {
        return (l21[]) d.clone();
    }
}
