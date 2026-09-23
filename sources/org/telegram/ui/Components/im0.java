package org.telegram.ui.Components;
public final class im0 {
    public static final im0 f25001a;
    public static final im0 f25002b;
    public static final im0[] f25003c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f25001a = r02;
        ?? r12 = new Enum("TAB", 1);
        f25002b = r12;
        f25003c = new im0[]{r02, r12};
    }

    public static im0 valueOf(String str) {
        return (im0) Enum.valueOf(im0.class, str);
    }

    public static im0[] values() {
        return (im0[]) f25003c.clone();
    }
}
