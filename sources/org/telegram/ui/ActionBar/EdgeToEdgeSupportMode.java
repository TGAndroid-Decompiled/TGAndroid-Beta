package org.telegram.ui.ActionBar;

public final class EdgeToEdgeSupportMode {
    public static final EdgeToEdgeSupportMode[] $VALUES;
    public static final EdgeToEdgeSupportMode FULL;
    public static final EdgeToEdgeSupportMode NONE;
    public static final EdgeToEdgeSupportMode VERTICAL;

    static {
        EdgeToEdgeSupportMode edgeToEdgeSupportMode = new EdgeToEdgeSupportMode("NONE", 0);
        NONE = edgeToEdgeSupportMode;
        EdgeToEdgeSupportMode edgeToEdgeSupportMode2 = new EdgeToEdgeSupportMode("VERTICAL", 1);
        VERTICAL = edgeToEdgeSupportMode2;
        EdgeToEdgeSupportMode edgeToEdgeSupportMode3 = new EdgeToEdgeSupportMode("FULL", 2);
        FULL = edgeToEdgeSupportMode3;
        $VALUES = new EdgeToEdgeSupportMode[]{edgeToEdgeSupportMode, edgeToEdgeSupportMode2, edgeToEdgeSupportMode3};
    }

    public static EdgeToEdgeSupportMode valueOf(String str) {
        return (EdgeToEdgeSupportMode) Enum.valueOf(EdgeToEdgeSupportMode.class, str);
    }

    public static EdgeToEdgeSupportMode[] values() {
        return (EdgeToEdgeSupportMode[]) $VALUES.clone();
    }
}
