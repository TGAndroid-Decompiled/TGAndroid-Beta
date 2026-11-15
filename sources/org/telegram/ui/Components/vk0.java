package org.telegram.ui.Components;
public final class vk0 {
    public static final vk0 f40458a;
    public static final vk0 f40459b;
    public static final vk0[] f40460c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f40458a = r02;
        ?? r12 = new Enum("TAB", 1);
        f40459b = r12;
        f40460c = new vk0[]{r02, r12};
    }

    public static vk0 valueOf(String str) {
        return (vk0) Enum.valueOf(vk0.class, str);
    }

    public static vk0[] values() {
        return (vk0[]) f40460c.clone();
    }
}
