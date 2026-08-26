package org.telegram.ui.iv;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;

public abstract class RichBlockChrome {
    public static int quoteInsetEnd(BlockRow blockRow) {
        int size = blockRow == null ? 0 : blockRow.quoteIds.size();
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(CalendarActivity$$ExternalSyntheticOutline0.m(size, 1, 16, 8));
    }
}
