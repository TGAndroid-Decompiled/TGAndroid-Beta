package org.telegram.ui.Components;
public final class ev0 {
    public static final ev0 f24682a;
    public static final ev0 f24683b;
    public static final ev0[] f24684c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f24682a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f24683b = r12;
        f24684c = new ev0[]{r02, r12};
    }

    public static ev0 valueOf(String str) {
        return (ev0) Enum.valueOf(ev0.class, str);
    }

    public static ev0[] values() {
        return (ev0[]) f24684c.clone();
    }
}
