package org.telegram.ui.Components;
public final class im0 {
    public static final im0 f24960a;
    public static final im0 f24961b;
    public static final im0[] f24962c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f24960a = r02;
        ?? r12 = new Enum("TAB", 1);
        f24961b = r12;
        f24962c = new im0[]{r02, r12};
    }

    public static im0 valueOf(String str) {
        return (im0) Enum.valueOf(im0.class, str);
    }

    public static im0[] values() {
        return (im0[]) f24962c.clone();
    }
}
