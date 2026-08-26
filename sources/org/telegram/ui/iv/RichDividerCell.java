package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class RichDividerCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    public boolean blockRtl;
    public RichEditorListView$$ExternalSyntheticLambda36 delegate;
    public final Paint paint;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint selectionPaint;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            RichDividerCell richDividerCell = (RichDividerCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            RichEditorListView$$ExternalSyntheticLambda36 richEditorListView$$ExternalSyntheticLambda36 = (RichEditorListView$$ExternalSyntheticLambda36) uItem.object2;
            richDividerCell.currentRow = blockRow;
            richDividerCell.delegate = richEditorListView$$ExternalSyntheticLambda36;
            richDividerCell.blockRtl = LocaleController.isRTL;
            richDividerCell.bindBlockInset(blockRow);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichDividerCell(context, resourcesProvider);
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public RichDividerCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint(1);
        this.selectionPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        updateColors$1();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int i = this.blockRtl ? 0 : this.blockInset;
        int measuredWidth = ((getMeasuredWidth() - (this.blockRtl ? this.blockInset : 0)) - i) / 4;
        Rect rect = new Rect((i + measuredWidth) - AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f) + ((getMeasuredWidth() - (this.blockRtl ? this.blockInset : 0)) - measuredWidth), AndroidUtilities.dp(12.0f));
        if (RichBlockSelection.placeholder == null) {
            RichBlockSelection.placeholder = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        arrayList.add(new RichBlockSelection.AnonymousClass1(RichBlockSelection.placeholder, rect));
    }

    public int[] getColorKeys() {
        return null;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public final void onBlockInsetChanged(int i) {
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        Canvas canvas2;
        int i = this.blockRtl ? 0 : this.blockInset;
        int measuredWidth = ((getMeasuredWidth() - (this.blockRtl ? this.blockInset : 0)) - i) / 4;
        int i2 = i + measuredWidth;
        int measuredWidth2 = (getMeasuredWidth() - (this.blockRtl ? this.blockInset : 0)) - measuredWidth;
        RichEditorListView$$ExternalSyntheticLambda36 richEditorListView$$ExternalSyntheticLambda36 = this.delegate;
        if (richEditorListView$$ExternalSyntheticLambda36 != null && (textSelectionHelper = richEditorListView$$ExternalSyntheticLambda36.f$0.getTextSelectionHelper()) != null && textSelectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(this);
            if (childAdapterPosition >= 0 && childAdapterPosition >= textSelectionHelper.startViewPosition && childAdapterPosition <= textSelectionHelper.endViewPosition) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i2 - AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(12.0f) + measuredWidth2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.selectionPaint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        float fDp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i2, fDp, measuredWidth2, AndroidUtilities.dp(1.0f) + fDp);
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.paint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(12.0f));
    }

    @Override
    public final void updateColors$1() {
        int i = Theme.key_chat_inDivider;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.paint.setColor(Theme.getColor(i, resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
    }
}
