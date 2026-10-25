package org.telegram.ui.ActionBar;
public final class e5 {
    public static final e5 f22603a;
    public static final e5 f22604b;
    public static final e5[] f22605c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f22603a = r02;
        ?? r12 = new Enum("MENU", 1);
        f22604b = r12;
        f22605c = new e5[]{r02, r12};
    }

    public static e5 valueOf(String str) {
        return (e5) Enum.valueOf(e5.class, str);
    }

    public static e5[] values() {
        return (e5[]) f22605c.clone();
    }
}
