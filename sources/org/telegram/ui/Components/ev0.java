package org.telegram.ui.Components;
public final class ev0 {
    public static final ev0 f26680a;
    public static final ev0 f26681b;
    public static final ev0[] f26682c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f26680a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f26681b = r12;
        f26682c = new ev0[]{r02, r12};
    }

    public static ev0 valueOf(String str) {
        return (ev0) Enum.valueOf(ev0.class, str);
    }

    public static ev0[] values() {
        return (ev0[]) f26682c.clone();
    }
}
