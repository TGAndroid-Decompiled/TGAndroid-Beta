package org.telegram.ui.iv;

import android.content.Context;
import android.widget.FrameLayout;

public abstract class RichBlockCell extends FrameLayout implements RichInsetCell {
    private int basePadBottom;
    private int basePadLeft;
    private int basePadRight;
    private int basePadTop;
    private int blockInset;
    protected BlockRow currentRow;
    private final RichBlockInset insetAnim;

    protected int nestedContentMargin() {
        return 0;
    }

    public RichBlockCell(Context context) {
        super(context);
        this.insetAnim = new RichBlockInset();
    }

    protected void setBlockPadding(int i, int i2, int i3, int i4) {
        this.basePadLeft = i;
        this.basePadTop = i2;
        this.basePadRight = i3;
        this.basePadBottom = i4;
        RichBlockChrome.applyInsetPx(this, this.blockInset, i, i2, i3, i4);
    }

    protected int blockInset() {
        return this.blockInset;
    }

    public void applyBlockInset(int i) {
        this.blockInset = i;
        onBlockInsetChanged(i);
    }

    protected void onBlockInsetChanged(int i) {
        int iInsetEndFor = RichBlockChrome.insetEndFor(this.currentRow);
        int iNestedContentMargin = (i > 0 || iInsetEndFor > 0) ? nestedContentMargin() : 0;
        BlockRow blockRow = this.currentRow;
        int iQuoteTopPad = (blockRow == null || !blockRow.quoteFirst) ? this.basePadTop : RichBlockChrome.quoteTopPad(blockRow);
        BlockRow blockRow2 = this.currentRow;
        RichBlockChrome.applyInsetPx(this, i + iNestedContentMargin, iInsetEndFor + iNestedContentMargin, this.basePadLeft, iQuoteTopPad, this.basePadRight, (blockRow2 == null || !blockRow2.quoteLast) ? this.basePadBottom : RichBlockChrome.quoteBottomPad(blockRow2));
    }

    protected void bindBlockInset(BlockRow blockRow) {
        this.insetAnim.apply(blockRow, new RichBlockCell$$ExternalSyntheticLambda0(this));
    }

    @Override
    public void resyncBlockInset(boolean z) {
        this.insetAnim.apply(this.currentRow, new RichBlockCell$$ExternalSyntheticLambda0(this), z);
    }
}
