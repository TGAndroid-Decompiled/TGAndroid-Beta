package org.telegram.ui.ActionBar;
public final class s5 {
    public static final s5 f23085a;
    public static final s5 f23086b;
    public static final s5[] f23087c;

    static {
        ?? r02 = new Enum("ICON", 0);
        f23085a = r02;
        ?? r12 = new Enum("TEXT", 1);
        f23086b = r12;
        f23087c = new s5[]{r02, r12};
    }

    public static s5 valueOf(String str) {
        return (s5) Enum.valueOf(s5.class, str);
    }

    public static s5[] values() {
        return (s5[]) f23087c.clone();
    }
}
