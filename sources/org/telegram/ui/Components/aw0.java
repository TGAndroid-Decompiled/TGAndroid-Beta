package org.telegram.ui.Components;
public final class aw0 {
    public static final aw0 f24737a;
    public static final aw0 f24738b;
    public static final aw0[] f24739c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f24737a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f24738b = r12;
        f24739c = new aw0[]{r02, r12};
    }

    public static aw0 valueOf(String str) {
        return (aw0) Enum.valueOf(aw0.class, str);
    }

    public static aw0[] values() {
        return (aw0[]) f24739c.clone();
    }
}
