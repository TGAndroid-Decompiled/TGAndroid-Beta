package org.telegram.ui.Components;
public final class on0 {
    public static final on0 f31329a;
    public static final on0 f31330b;
    public static final on0[] f31331c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f31329a = r02;
        ?? r12 = new Enum("TAB", 1);
        f31330b = r12;
        f31331c = new on0[]{r02, r12};
    }

    public static on0 valueOf(String str) {
        return (on0) Enum.valueOf(on0.class, str);
    }

    public static on0[] values() {
        return (on0[]) f31331c.clone();
    }
}
