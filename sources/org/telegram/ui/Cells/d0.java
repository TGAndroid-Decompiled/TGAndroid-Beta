package org.telegram.ui.Cells;

import org.telegram.messenger.BotInlineKeyboard;
public abstract class d0 {
    public static final int[] f18978a;

    static {
        int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
        f18978a = iArr;
        try {
            iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18978a[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18978a[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
