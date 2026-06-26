package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import ru.noties.jlatexmath.JLatexMathDrawable;

public class RichMathCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private Bitmap bitmap;
    private BlockRow currentRow;
    private Delegate delegate;
    private final ImageView image;
    private int paintColor;
    private final int[] rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private final HorizontalScrollView scrollView;
    private final Paint selectionPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();
    }

    public RichMathCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectionPaint = new Paint(1);
        this.paintColor = 0;
        this.rect = new int[4];
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.image = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, LayoutHelper.createFrame(-1, -2, 16));
        updateColors();
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        rebuild();
    }

    public BlockRow getRow() {
        return this.currentRow;
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

    public void rebuild() {
        this.bitmap = null;
        this.scrollView.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source)) {
            try {
                JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(source).textSize(AndroidUtilities.dp(SharedConfig.fontSize + 4)).build();
                int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                    this.bitmap = bitmapCreateBitmap;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.image.setImageBitmap(this.bitmap);
        invalidate();
    }

    @Override
    public void updateColors() {
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        this.paintColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
        this.image.setColorFilter(new PorterDuffColorFilter(this.paintColor, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    private boolean isScrollable() {
        return this.bitmap != null && this.image.getWidth() > this.scrollView.getWidth();
    }

    private void selectionRect(int[] iArr) {
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (isScrollable()) {
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
        iArr[2] = width2 + width + AndroidUtilities.dp(4.0f);
        iArr[3] = height;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.paintColor != Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider)) {
            updateColors();
        }
        if (this.bitmap == null || !isCellSelected()) {
            return;
        }
        selectionRect(this.rect);
        int[] iArr = this.rect;
        canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.selectionPaint);
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition >= selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        selectionRect(this.rect);
        int[] iArr = this.rect;
        arrayList.add(RichBlockSelection.of(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
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
        public RichMathCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichMathCell(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichMathCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}
