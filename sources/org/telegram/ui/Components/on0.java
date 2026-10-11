package org.telegram.ui.Components;
public final class on0 {
    public static final on0 f29559a;
    public static final on0 f29560b;
    public static final on0[] f29561c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f29559a = r02;
        ?? r12 = new Enum("TAB", 1);
        f29560b = r12;
        f29561c = new on0[]{r02, r12};
    }

    public static on0 valueOf(String str) {
        return (on0) Enum.valueOf(on0.class, str);
    }

    public static on0[] values() {
        return (on0[]) f29561c.clone();
    }
}
