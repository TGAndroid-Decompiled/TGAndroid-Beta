package org.telegram.ui.iv;

import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import org.telegram.messenger.AndroidUtilities;

public abstract class RichBlockChrome {
    public static int quoteInsetEnd(BlockRow blockRow) {
        int size = blockRow == null ? 0 : blockRow.quoteIds.size();
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(zzkv.m(size, 1, 16, 8));
    }
}
