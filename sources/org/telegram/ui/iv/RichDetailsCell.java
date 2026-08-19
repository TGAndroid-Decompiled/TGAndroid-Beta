package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichDetailsCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private final AnimatedArrowDrawable arrow;
    private final Drawable.Callback arrowCallback;
    private final View arrowView;
    private BlockRow currentRow;
    private Delegate delegate;
    private final Paint dividerPaint;
    private final RichEditText editText;
    private boolean hijackingSelection;
    private final Theme.ResourcesProvider resourcesProvider;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onLockedInsert(CharSequence charSequence);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        boolean onSelectAll(BlockRow blockRow);

        void onSpansChanged(BlockRow blockRow);

        void onTitleBackspace(BlockRow blockRow);

        void onTitleChanged(BlockRow blockRow);

        void onTitleEnter(BlockRow blockRow);

        void onToggle(BlockRow blockRow);
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public RichDetailsCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint();
        this.resourcesProvider = resourcesProvider;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(Theme.getColor(Theme.key_chat_inArticleDetailsArrow, resourcesProvider), 12.66f, 6.16f, 1.66f);
        this.arrow = animatedArrowDrawable;
        Drawable.Callback callback = new Drawable.Callback() {
            @Override
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override
            public void invalidateDrawable(Drawable drawable) {
                RichDetailsCell.this.arrowView.invalidate();
            }
        };
        this.arrowCallback = callback;
        animatedArrowDrawable.setCallback(callback);
        View view = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                RichDetailsCell.this.arrow.draw(canvas);
                canvas.restore();
            }
        };
        this.arrowView = view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                RichDetailsCell.$r8$lambda$lbb7UyFLk4IpptdW_FZ1TRn3sYc(this.f$0, view2);
            }
        });
        addView(view, LayoutHelper.createFrame(53, -1, 51));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setAllowNewlines(false);
        richEditText.setTextSize(1, SharedConfig.fontSize);
        richEditText.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        richEditText.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        richEditText.setListener(new AnonymousClass3());
        richEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
            @Override
            public final void onSpansChanged() {
                RichDetailsCell.$r8$lambda$_HLRs6uEkgX4dtZqIbYfAQSF308(this.f$0);
            }
        });
        addView(richEditText, LayoutHelper.createFrame(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public static void $r8$lambda$lbb7UyFLk4IpptdW_FZ1TRn3sYc(RichDetailsCell richDetailsCell, View view) {
        BlockRow blockRow;
        Delegate delegate = richDetailsCell.delegate;
        if (delegate == null || (blockRow = richDetailsCell.currentRow) == null) {
            return;
        }
        delegate.onToggle(blockRow);
    }

    class AnonymousClass3 implements RichEditText.Listener {
        @Override
        public boolean onPaste(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onPaste(this, richEditText);
        }

        @Override
        public boolean onTab(RichEditText richEditText, boolean z) {
            return RichEditText.Listener.CC.$default$onTab(this, richEditText, z);
        }

        @Override
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            RichEditText.Listener.CC.$default$onTextWillChange(this, richEditText, i, i2);
        }

        AnonymousClass3() {
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            RichDetailsCell.this.rememberAutoBoldState();
            if (RichDetailsCell.this.currentRow != null && (RichDetailsCell.this.currentRow.block instanceof TL_iv.pageBlockDetails)) {
                ((TL_iv.pageBlockDetails) RichDetailsCell.this.currentRow.block).title = RichTextStyle.fromSpannable(editable);
            }
            if (RichDetailsCell.this.delegate == null || RichDetailsCell.this.currentRow == null) {
                return;
            }
            RichDetailsCell.this.delegate.onTitleChanged(RichDetailsCell.this.currentRow);
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            if (RichDetailsCell.this.delegate == null || RichDetailsCell.this.currentRow == null) {
                return;
            }
            RichDetailsCell.this.delegate.onTitleEnter(RichDetailsCell.this.currentRow);
        }

        @Override
        public void onBackspaceOnEmpty(RichEditText richEditText) {
            if (RichDetailsCell.this.delegate == null || RichDetailsCell.this.currentRow == null) {
                return;
            }
            RichDetailsCell.this.delegate.onTitleBackspace(RichDetailsCell.this.currentRow);
        }

        @Override
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            if (RichDetailsCell.this.delegate == null || RichDetailsCell.this.currentRow == null || richEditText.length() != 0) {
                return false;
            }
            RichDetailsCell.this.delegate.onTitleBackspace(RichDetailsCell.this.currentRow);
            return true;
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichDetailsCell.this.delegate != null) {
                RichDetailsCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            if (RichDetailsCell.this.delegate != null) {
                RichDetailsCell.this.delegate.onLockedInsert(charSequence);
            }
        }

        @Override
        public boolean onSelectAll(RichEditText richEditText) {
            if (RichDetailsCell.this.delegate == null || RichDetailsCell.this.currentRow == null) {
                return false;
            }
            return RichDetailsCell.this.delegate.onSelectAll(RichDetailsCell.this.currentRow);
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichDetailsCell.this.hijackingSelection || i == i2 || RichDetailsCell.this.delegate == null || (selectionHelper = RichDetailsCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            if (selectionHelper.isInSelectionMode() && selectionHelper.getSelectedCell() == RichDetailsCell.this) {
                return;
            }
            RichDetailsCell.this.post(new Runnable() {
                @Override
                public final void run() {
                    RichDetailsCell.AnonymousClass3.m4912$r8$lambda$NQEIFl3aWVH0lhGZEPxnTsjUk(this.f$0, richEditText, i2, selectionHelper, i);
                }
            });
        }

        public static void m4912$r8$lambda$NQEIFl3aWVH0lhGZEPxnTsjUk(AnonymousClass3 anonymousClass3, RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            anonymousClass3.getClass();
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd() || !articleTextSelectionHelper.selectRangeOf(RichDetailsCell.this, i2, i)) {
                return;
            }
            RichDetailsCell.this.hijackingSelection = true;
            richEditText.setSelection(i);
            RichDetailsCell.this.hijackingSelection = false;
        }
    }

    public static void $r8$lambda$_HLRs6uEkgX4dtZqIbYfAQSF308(RichDetailsCell richDetailsCell) {
        BlockRow blockRow;
        richDetailsCell.rememberAutoBoldState();
        BlockRow blockRow2 = richDetailsCell.currentRow;
        if (blockRow2 != null) {
            TL_iv.PageBlock pageBlock = blockRow2.block;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = RichTextStyle.fromSpannable(richDetailsCell.editText.getText());
            }
        }
        Delegate delegate = richDetailsCell.delegate;
        if (delegate == null || (blockRow = richDetailsCell.currentRow) == null) {
            return;
        }
        delegate.onSpansChanged(blockRow);
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        boolean z = this.currentRow != blockRow;
        this.currentRow = blockRow;
        this.delegate = delegate;
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            this.arrow.setAnimationProgressAnimated(pageblockdetails.open ? 0.0f : 1.0f);
            CharSequence spannable = RichTextStyle.toSpannable(pageblockdetails.title);
            initializeAutoBold(blockRow, spannable);
            this.editText.setAutoBold(blockRow.titleAutoBold);
            if (z || !String.valueOf(this.editText.getText()).equals(RichTextStyle.plainOf(pageblockdetails.title))) {
                this.editText.setTextSilently(spannable);
                this.editText.invalidateEffects();
            }
        }
    }

    private void initializeAutoBold(BlockRow blockRow, CharSequence charSequence) {
        if (blockRow.titleAutoBoldInitialized) {
            return;
        }
        boolean z = true;
        blockRow.titleAutoBoldInitialized = true;
        if (charSequence.length() != 0 && (RichTextStyle.stylesFullyCovering(charSequence, 0, charSequence.length()) & 1) == 0) {
            z = false;
        }
        blockRow.titleAutoBold = z;
    }

    public void rememberAutoBoldState() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return;
        }
        blockRow.titleAutoBoldInitialized = true;
        blockRow.titleAutoBold = this.editText.isAutoBold();
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public RichEditText getEditText() {
        return this.editText;
    }

    public void requestEditFocus() {
        this.editText.requestEditFocus();
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
    }

    public boolean isPressOnText(int i, int i2) {
        int lineForVertical;
        Layout layout = this.editText.getLayout();
        if (layout != null && this.editText.length() != 0) {
            int left = i - (this.editText.getLeft() + this.editText.getPaddingLeft());
            int top = i2 - (this.editText.getTop() + this.editText.getPaddingTop());
            if (top >= 0 && top < layout.getHeight() && (lineForVertical = layout.getLineForVertical(top)) >= 0 && lineForVertical < layout.getLineCount()) {
                int iDp = AndroidUtilities.dp(24.0f);
                int iMax = Math.max(0, (this.editText.getWidth() - this.editText.getPaddingLeft()) - this.editText.getPaddingRight());
                float f = iDp;
                float fMax = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
                float fMin = Math.min(iMax, layout.getLineRight(lineForVertical) + f);
                float f2 = left;
                if (f2 >= fMax && f2 <= fMin) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPressOnEmptyEditText(int i, int i2) {
        return this.editText.length() == 0 && i >= this.editText.getLeft() && i <= this.editText.getLeft() + this.editText.getWidth() && i2 >= this.editText.getTop() && i2 <= this.editText.getTop() + this.editText.getHeight();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public void updateColors() {
        this.editText.updateColors();
        this.arrow.setColor(Theme.getColor(Theme.key_chat_inArticleDetailsArrow, this.resourcesProvider));
        this.dividerPaint.setColor(Theme.getColor(Theme.key_chat_inArticleDetailsLine, this.resourcesProvider));
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout = this.editText.getLayout();
        if (layout == null) {
            return;
        }
        final int left = this.editText.getLeft() + this.editText.getPaddingLeft();
        final int top = this.editText.getTop() + this.editText.getPaddingTop();
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
            public Rect getSelectionBounds() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getSelectionBounds(this);
            }

            @Override
            public Layout getLayout() {
                return layout;
            }

            @Override
            public int getX() {
                return left;
            }

            @Override
            public int getY() {
                return top;
            }

            @Override
            public CharSequence getText() {
                if (RichDetailsCell.this.currentRow != null && (RichDetailsCell.this.currentRow.block instanceof TL_iv.pageBlockDetails)) {
                    return RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) RichDetailsCell.this.currentRow.block).title);
                }
                return "";
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        int measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, measuredHeight - 1, getMeasuredWidth(), measuredHeight, this.dividerPaint);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper != null && this.editText.getLayout() != null) {
            canvas.save();
            canvas.translate(this.editText.getLeft() + this.editText.getPaddingLeft(), this.editText.getTop() + this.editText.getPaddingTop());
            selectionHelper.draw(canvas, this, 0);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
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
        public RichDetailsCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichDetailsCell(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichDetailsCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}
