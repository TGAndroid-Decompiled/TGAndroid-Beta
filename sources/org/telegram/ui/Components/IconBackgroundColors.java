package org.telegram.ui.Components;

public enum IconBackgroundColors {
    BLUE(-14899731, -15431455),
    BLUE_ALT(-14899731, -15497247),
    BLUE_DEEP(-11565578, -13276952),
    BLUE_LIGHT(-14965523, -15431455),
    ORANGE(-1007845, -1996271),
    ORANGE_DEEP(-881871, -1940716),
    GREEN(-11154873, -14175180),
    RED(-765355, -2148011),
    CYAN(-13451058, -14836538),
    PURPLE(-3903756, -6335009),
    GRAY(-7956054, -9534569);

    public final int bottom;
    public final int top;

    IconBackgroundColors(int i, int i2) {
        this.top = i;
        this.bottom = i2;
    }
}
