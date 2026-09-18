package org.telegram.ui.Components;
public final class u21 {
    public static final u21 f28263a;
    public static final u21 f28264b;
    public static final u21 f28265c;
    public static final u21[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f28263a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f28264b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f28265c = r32;
        d = new u21[]{r02, r12, r32};
    }

    public static u21 valueOf(String str) {
        return (u21) Enum.valueOf(u21.class, str);
    }

    public static u21[] values() {
        return (u21[]) d.clone();
    }
}
