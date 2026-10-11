package org.telegram.ui.ActionBar;
public final class x4 {
    public static final x4 f21682a;
    public static final x4 f21683b;
    public static final x4[] f21684c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f21682a = r02;
        ?? r12 = new Enum("MENU", 1);
        f21683b = r12;
        f21684c = new x4[]{r02, r12};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f21684c.clone();
    }
}
