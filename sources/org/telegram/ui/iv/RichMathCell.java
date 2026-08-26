package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class RichMathCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    public Bitmap bitmap;
    public RichEditorListView.AnonymousClass10 delegate;
    public final ImageView image;
    public int paintColor;
    public final int[] rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public final HorizontalScrollView scrollView;
    public final Paint selectionPaint;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichMathCell) view).bind((BlockRow) uItem.object, (RichEditorListView.AnonymousClass10) uItem.object2);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichMathCell(context, resourcesProvider);
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public RichMathCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectionPaint = new Paint(1);
        this.paintColor = 0;
        this.rect = new int[4];
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        setBlockPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.image = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, LayoutHelper.createFrame(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return ((TL_iv.pageBlockMath) pageBlock).source;
        }
        return null;
    }

    public final void bind(BlockRow blockRow, RichEditorListView.AnonymousClass10 anonymousClass10) {
        Latex latexRender;
        this.currentRow = blockRow;
        this.delegate = anonymousClass10;
        bindBlockInset(blockRow);
        this.bitmap = null;
        this.scrollView.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (latexRender = Latex.render(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.bitmap = (Bitmap) latexRender.bitmap;
        }
        this.image.setImageBitmap(this.bitmap);
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.rect;
        selectionRect(iArr);
        Rect rect = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
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
    public final void onDraw(Canvas canvas) {
        RichEditorListView.AnonymousClass10 anonymousClass10;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        int childAdapterPosition;
        if (this.paintColor != Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider)) {
            updateColors();
        }
        if (this.bitmap == null || (anonymousClass10 = this.delegate) == null || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null || !textSelectionHelper.isInSelectionMode() || !(getParent() instanceof RecyclerView) || (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) < 0 || childAdapterPosition < textSelectionHelper.startViewPosition || childAdapterPosition > textSelectionHelper.endViewPosition) {
            return;
        }
        int[] iArr = this.rect;
        selectionRect(iArr);
        canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.selectionPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public final void selectionRect(int[] iArr) {
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.bitmap != null && this.image.getWidth() > this.scrollView.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.bitmap;
        int width = bitmap != null ? bitmap.getWidth() : Math.max(1, getWidth() / 2);
        int width2 = (getWidth() - width) / 2;
        iArr[0] = width2 - AndroidUtilities.dp(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = AndroidUtilities.dp(4.0f) + width2 + width;
        iArr[3] = height;
    }

    @Override
    public final void updateColors() {
        int i = Theme.key_chat_inTextSelectionHighlight;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.selectionPaint.setColor(Theme.getColor(i, resourcesProvider));
        this.paintColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
        this.image.setColorFilter(new PorterDuffColorFilter(this.paintColor, PorterDuff.Mode.SRC_IN));
        invalidate();
    }
}
