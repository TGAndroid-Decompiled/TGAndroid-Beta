package org.telegram.ui.Components;
public final class j31 {
    public static final j31 f25269a;
    public static final j31 f25270b;
    public static final j31 f25271c;
    public static final j31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f25269a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f25270b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f25271c = r32;
        d = new j31[]{r02, r12, r32};
    }

    public static j31 valueOf(String str) {
        return (j31) Enum.valueOf(j31.class, str);
    }

    public static j31[] values() {
        return (j31[]) d.clone();
    }
}
