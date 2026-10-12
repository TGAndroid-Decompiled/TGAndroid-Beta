package org.telegram.ui.Cells;

import org.telegram.messenger.BotInlineKeyboard;
public abstract class e0 {
    public static final int[] f21093a;

    static {
        int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
        f21093a = iArr;
        try {
            iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21093a[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21093a[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
