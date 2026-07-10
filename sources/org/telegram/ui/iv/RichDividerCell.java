package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichDividerCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private boolean blockRtl;
    private Delegate delegate;
    private final Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public RichDividerCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint(1);
        this.selectionPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    protected void onBlockInsetChanged(int i) {
        invalidate();
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.blockRtl = RichBlockChrome.rtl();
        bindBlockInset(blockRow);
    }

    private int regionLo() {
        if (this.blockRtl) {
            return 0;
        }
        return blockInset();
    }

    private int regionHi() {
        return getMeasuredWidth() - (this.blockRtl ? blockInset() : 0);
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public void updateColors() {
        this.paint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        int iRegionLo = regionLo();
        int iMax = Math.max(1, (regionHi() - iRegionLo) / 3);
        arrayList.add(RichBlockSelection.of((iRegionLo + iMax) - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), iRegionLo + (iMax * 2) + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f)));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(18.0f));
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition >= selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int iRegionLo = regionLo();
        int iMax = Math.max(1, (regionHi() - iRegionLo) / 3);
        int i = iRegionLo + iMax;
        int i2 = iRegionLo + (iMax * 2);
        this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_chat_inReplyMessageText, this.resourcesProvider), 0.2f));
        if (isCellSelected()) {
            canvas.drawRoundRect(i - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f) + i2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.selectionPaint);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i, AndroidUtilities.dp(8.0f), i2, AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.paint);
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public RichDividerCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichDividerCell(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichDividerCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}
