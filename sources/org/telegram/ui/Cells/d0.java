package org.telegram.ui.Cells;

import org.telegram.messenger.BotInlineKeyboard;
public abstract class d0 {
    public static final int[] f24201a;

    static {
        int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
        f24201a = iArr;
        try {
            iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24201a[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24201a[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
