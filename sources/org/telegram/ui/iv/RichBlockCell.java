package org.telegram.ui.iv;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public abstract class RichBlockCell extends FrameLayout implements RichInsetCell {
    public int basePadBottom;
    public int basePadLeft;
    public int basePadRight;
    public int basePadTop;
    public int blockInset;
    public BlockRow currentRow;
    public final RichBlockInset insetAnim;

    public RichBlockCell(Context context) {
        super(context);
        RichBlockInset richBlockInset = new RichBlockInset();
        richBlockInset.boundRowId = Long.MIN_VALUE;
        richBlockInset.currentPx = -1;
        this.insetAnim = richBlockInset;
    }

    public final void bindBlockInset(BlockRow blockRow) {
        this.insetAnim.apply(blockRow, new RichBlockCell$$ExternalSyntheticLambda0(this, 1));
    }

    public int nestedContentMargin() {
        return 0;
    }

    public void onBlockInsetChanged(int i) {
        int iDp;
        int iQuoteInsetEnd = RichBlockChrome.quoteInsetEnd(this.currentRow);
        int iDp2 = 0;
        int iNestedContentMargin = (i > 0 || iQuoteInsetEnd > 0) ? nestedContentMargin() : 0;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || !blockRow.quoteFirst) {
            iDp = this.basePadTop;
        } else {
            int i2 = blockRow.quoteTopEdge;
            iDp = i2 <= 0 ? 0 : AndroidUtilities.dp(zzkv.m(i2, 1, 16, 10));
        }
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 == null || !blockRow2.quoteLast) {
            iDp2 = this.basePadBottom;
        } else {
            int i3 = blockRow2.quoteBottomEdge;
            if (i3 > 0) {
                iDp2 = AndroidUtilities.dp(zzkv.m(i3, 1, 16, 10));
            }
        }
        int i4 = i + iNestedContentMargin;
        int i5 = iQuoteInsetEnd + iNestedContentMargin;
        int i6 = this.basePadLeft;
        int i7 = this.basePadRight;
        if (LocaleController.isRTL) {
            setPadding(i6 + i5, iDp, i7 + i4, iDp2);
        } else {
            setPadding(i6 + i4, iDp, i7 + i5, iDp2);
        }
    }

    public final void setBlockPadding(int i, int i2, int i3, int i4) {
        this.basePadLeft = i;
        this.basePadTop = i2;
        this.basePadRight = i3;
        this.basePadBottom = i4;
        int i5 = this.blockInset;
        if (LocaleController.isRTL) {
            setPadding(i, i2, i3 + i5, i4);
        } else {
            setPadding(i + i5, i2, i3, i4);
        }
    }
}
