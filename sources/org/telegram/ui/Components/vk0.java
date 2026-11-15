package org.telegram.ui.Components;
public final class vk0 {
    public static final vk0 f40455a;
    public static final vk0 f40456b;
    public static final vk0[] f40457c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f40455a = r02;
        ?? r12 = new Enum("TAB", 1);
        f40456b = r12;
        f40457c = new vk0[]{r02, r12};
    }

    public static vk0 valueOf(String str) {
        return (vk0) Enum.valueOf(vk0.class, str);
    }

    public static vk0[] values() {
        return (vk0[]) f40457c.clone();
    }
}
