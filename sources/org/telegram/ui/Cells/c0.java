package org.telegram.ui.Cells;

import org.telegram.messenger.BotInlineKeyboard;
public abstract class c0 {
    public static final int[] f22197a;

    static {
        int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
        f22197a = iArr;
        try {
            iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22197a[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22197a[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
