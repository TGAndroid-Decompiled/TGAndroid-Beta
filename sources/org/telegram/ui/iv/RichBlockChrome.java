package org.telegram.ui.iv;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public abstract class RichBlockChrome {
    public static int quoteEdgePad(int i) {
        if (i <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(((i - 1) * 16) + 10);
    }

    public static int quoteTopPad(BlockRow blockRow) {
        if (blockRow == null) {
            return 0;
        }
        return quoteEdgePad(blockRow.quoteTopEdge);
    }

    public static int quoteBottomPad(BlockRow blockRow) {
        if (blockRow == null) {
            return 0;
        }
        return quoteEdgePad(blockRow.quoteBottomEdge);
    }

    public static int insetForDepth(int i) {
        if (i <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(((i - 1) * 24) + 28);
    }

    public static int quoteDepth(BlockRow blockRow) {
        if (blockRow == null) {
            return 0;
        }
        return blockRow.quoteIds.size();
    }

    public static int quoteInset(BlockRow blockRow) {
        if (quoteDepth(blockRow) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(((r0 - 1) * 16) + 12);
    }

    public static int quoteInsetEnd(BlockRow blockRow) {
        if (quoteDepth(blockRow) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(((r0 - 1) * 16) + 8);
    }

    public static int insetFor(BlockRow blockRow) {
        if (blockRow == null) {
            return 0;
        }
        return quoteInset(blockRow) + insetForDepth(Math.max(0, blockRow.level));
    }

    public static int insetEndFor(BlockRow blockRow) {
        return quoteInsetEnd(blockRow);
    }

    public static boolean rtl() {
        return LocaleController.isRTL;
    }

    public static void applyInsetPx(View view, int i, int i2, int i3, int i4, int i5) {
        applyInsetPx(view, i, 0, i2, i3, i4, i5);
    }

    public static void applyInsetPx(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        if (rtl()) {
            view.setPadding(i3 + i2, i4, i5 + i, i6);
        } else {
            view.setPadding(i3 + i, i4, i5 + i2, i6);
        }
    }
}
