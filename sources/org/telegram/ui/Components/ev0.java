package org.telegram.ui.Components;
public final class ev0 {
    public static final ev0 f23754a;
    public static final ev0 f23755b;
    public static final ev0[] f23756c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f23754a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f23755b = r12;
        f23756c = new ev0[]{r02, r12};
    }

    public static ev0 valueOf(String str) {
        return (ev0) Enum.valueOf(ev0.class, str);
    }

    public static ev0[] values() {
        return (ev0[]) f23756c.clone();
    }
}
