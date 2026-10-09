package org.telegram.ui.Components;
public final class y31 {
    public static final y31 f33115a;
    public static final y31 f33116b;
    public static final y31 f33117c;
    public static final y31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f33115a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f33116b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f33117c = r32;
        d = new y31[]{r02, r12, r32};
    }

    public static y31 valueOf(String str) {
        return (y31) Enum.valueOf(y31.class, str);
    }

    public static y31[] values() {
        return (y31[]) d.clone();
    }
}
