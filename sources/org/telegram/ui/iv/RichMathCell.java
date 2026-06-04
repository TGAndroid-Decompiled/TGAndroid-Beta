package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
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
    private final Paint backgroundPaint;
    private Bitmap bitmap;
    private final View clickView;
    private BlockRow currentRow;
    private Delegate delegate;
    private final Paint mathPaint;
    private int paintColor;
    private final TextPaint placeholderPaint;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;
    private Layout stubLayout;
    private final TextPaint stubPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onEditMath(BlockRow blockRow);
    }

    public RichMathCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.mathPaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        this.selectionPaint = new Paint(1);
        TextPaint textPaint = new TextPaint();
        this.stubPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.placeholderPaint = textPaint2;
        this.paintColor = 0;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        textPaint.setTextSize(1.0f);
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTextAlign(Paint.Align.CENTER);
        setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        View view = new View(context);
        this.clickView = view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$new$0(view2);
            }
        });
        addView(view, LayoutHelper.createFrame(-1, -1, 119));
        updateColors();
    }

    public void lambda$new$0(View view) {
        Delegate delegate;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (delegate = this.delegate) == null) {
            return;
        }
        delegate.onEditMath(blockRow);
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
        String source = getSource();
        if (!TextUtils.isEmpty(source)) {
            try {
                JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(source).textSize(AndroidUtilities.dp(20.0f)).build();
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
        requestLayout();
        invalidate();
    }

    @Override
    public void updateColors() {
        this.backgroundPaint.setColor(Theme.getColor(Theme.key_chat_inFileBackground, this.resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        this.placeholderPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.5f));
        this.paintColor = 0;
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int iDp;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            iDp = bitmap.getHeight() + getPaddingTop();
            paddingBottom = getPaddingBottom();
        } else {
            iDp = AndroidUtilities.dp(64.0f) + getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp + paddingBottom, 1073741824));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int paddingTop = getPaddingTop();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        if (this.bitmap != null) {
            int i = this.paintColor;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            if (i != Theme.getColor(i2, this.resourcesProvider)) {
                Paint paint = this.mathPaint;
                int color = Theme.getColor(i2, this.resourcesProvider);
                this.paintColor = color;
                paint.setColor(color);
            }
            canvas.drawBitmap(this.bitmap, (getMeasuredWidth() - this.bitmap.getWidth()) / 2.0f, paddingTop, this.mathPaint);
        } else {
            float f = paddingTop;
            canvas.drawRect(AndroidUtilities.dp(16.0f), f, getMeasuredWidth() - AndroidUtilities.dp(16.0f), measuredHeight, this.backgroundPaint);
            canvas.drawText("Tap to add an equation", getMeasuredWidth() / 2.0f, (f + ((measuredHeight - paddingTop) / 2.0f)) - ((this.placeholderPaint.descent() + this.placeholderPaint.ascent()) / 2.0f), this.placeholderPaint);
        }
        if (isCellSelected()) {
            canvas.drawRect(AndroidUtilities.dp(16.0f), paddingTop, getMeasuredWidth() - AndroidUtilities.dp(16.0f), measuredHeight, this.selectionPaint);
        }
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition >= selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        if (this.stubLayout == null) {
            this.stubLayout = new StaticLayout("•", this.stubPaint, Math.max(1, getMeasuredWidth()), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        final Layout layout = this.stubLayout;
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
            @Override
            public CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
            }

            @Override
            public int getRow() {
                return 0;
            }

            @Override
            public int getX() {
                return 0;
            }

            @Override
            public int getY() {
                return 0;
            }

            @Override
            public Layout getLayout() {
                return layout;
            }
        });
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.stubLayout = null;
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
