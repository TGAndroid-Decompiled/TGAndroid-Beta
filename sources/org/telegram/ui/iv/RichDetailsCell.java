package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda153;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayResultsMessageCell;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.MuteButton;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;

public final class RichDetailsCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    public final AnimatedArrowDrawable arrow;
    public final MuteButton.AnonymousClass1 arrowView;
    public BlockRow currentRow;
    public RichEditorListView.AnonymousClass13 delegate;
    public final Paint dividerPaint;
    public final RichEditText editText;
    public boolean hijackingSelection;
    public final Theme.ResourcesProvider resourcesProvider;

    public final class AnonymousClass1 implements Drawable.Callback {
        public final int $r8$classId;
        public Object this$0;

        public AnonymousClass1() {
            this.$r8$classId = 1;
        }

        @Override
        public final void invalidateDrawable(Drawable drawable) {
            switch (this.$r8$classId) {
                case 0:
                    ((RichDetailsCell) this.this$0).arrowView.invalidate();
                    break;
                case 1:
                    break;
                case 2:
                    ((AnimatedVectorDrawableCompat) this.this$0).invalidateSelf();
                    break;
                case 3:
                    ((GiveawayMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 4:
                    ((GiveawayResultsMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 5:
                    ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) this.this$0;
                    if (reactionButton.parentView != null) {
                        reactionButton.parentView.invalidate();
                        if (reactionButton.inGroup && reactionButton.parentView.getParent() != null && (reactionButton.parentView.getParent().getParent() instanceof View)) {
                            ((View) reactionButton.parentView.getParent().getParent()).invalidate();
                            break;
                        }
                    }
                    break;
                default:
                    ((StarGiftSheet.StarGiftDrawableIcon) this.this$0).view.invalidate();
                    break;
            }
        }

        @Override
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            switch (this.$r8$classId) {
                case 1:
                    Drawable.Callback callback = (Drawable.Callback) this.this$0;
                    if (callback != null) {
                        callback.scheduleDrawable(drawable, runnable, j);
                    }
                    break;
                case 2:
                    ((AnimatedVectorDrawableCompat) this.this$0).scheduleSelf(runnable, j);
                    break;
                case 3:
                    ((GiveawayMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 4:
                    ((GiveawayResultsMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 5:
                    ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) this.this$0;
                    if (reactionButton.parentView != null) {
                        reactionButton.parentView.scheduleDrawable(drawable, runnable, j);
                    }
                    break;
            }
        }

        @Override
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            switch (this.$r8$classId) {
                case 1:
                    Drawable.Callback callback = (Drawable.Callback) this.this$0;
                    if (callback != null) {
                        callback.unscheduleDrawable(drawable, runnable);
                    }
                    break;
                case 2:
                    ((AnimatedVectorDrawableCompat) this.this$0).unscheduleSelf(runnable);
                    break;
                case 3:
                    ((GiveawayMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 4:
                    ((GiveawayResultsMessageCell) this.this$0).parentView.invalidate();
                    break;
                case 5:
                    ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) this.this$0;
                    if (reactionButton.parentView != null) {
                        reactionButton.parentView.unscheduleDrawable(drawable, runnable);
                    }
                    break;
            }
        }

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void invalidateDrawable$androidx$appcompat$graphics$drawable$DrawableContainerCompat$BlockInvalidateCallback(Drawable drawable) {
        }

        private final void unscheduleDrawable$org$telegram$ui$Stars$StarGiftSheet$StarGiftDrawableIcon$1(Drawable drawable, Runnable runnable) {
        }

        private final void unscheduleDrawable$org$telegram$ui$iv$RichDetailsCell$1(Drawable drawable, Runnable runnable) {
        }

        private final void scheduleDrawable$org$telegram$ui$Stars$StarGiftSheet$StarGiftDrawableIcon$1(Drawable drawable, Runnable runnable, long j) {
        }

        private final void scheduleDrawable$org$telegram$ui$iv$RichDetailsCell$1(Drawable drawable, Runnable runnable, long j) {
        }
    }

    public final class AnonymousClass3 implements RichEditText.Listener {
        public AnonymousClass3() {
        }

        @Override
        public final boolean onBackspaceAtStart(RichEditText richEditText) {
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            if (richDetailsCell.delegate == null || richDetailsCell.currentRow == null || richEditText.length() != 0) {
                return false;
            }
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            RichEditorListView.this.deleteDetails(richDetailsCell.currentRow);
            return true;
        }

        @Override
        public final void onBackspaceOnEmpty() {
            BlockRow blockRow;
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || (blockRow = richDetailsCell.currentRow) == null) {
                return;
            }
            RichEditorListView.this.deleteDetails(blockRow);
        }

        @Override
        public final void onEnterPressed(RichEditText richEditText) {
            BlockRow blockRow;
            RichEditorListView richEditorListView;
            ArrayList arrayList;
            int iIndexOf;
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || (blockRow = richDetailsCell.currentRow) == null || (iIndexOf = (arrayList = (richEditorListView = RichEditorListView.this).rows).indexOf(blockRow)) < 0) {
                return;
            }
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                richEditorListView.adapter.update(true);
            }
            int i = iIndexOf + 1;
            if (i >= arrayList.size() || ((BlockRow) arrayList.get(i)).detailsEnd || RichEditorListView.isDetailsHeader((BlockRow) arrayList.get(i))) {
                return;
            }
            richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda2(richEditorListView, (BlockRow) arrayList.get(i), 24));
        }

        @Override
        public final void onLockedInsert(CharSequence charSequence) {
            RichEditorListView.AnonymousClass13 anonymousClass13 = RichDetailsCell.this.delegate;
            if (anonymousClass13 == null || charSequence == null || charSequence.length() <= 0) {
                return;
            }
            RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
        }

        @Override
        public final boolean onPaste(RichEditText richEditText) {
            return false;
        }

        @Override
        public final void onRequestWindowFocusable(RichEditText richEditText) {
            RichEditorListView.AnonymousClass13 anonymousClass13 = RichDetailsCell.this.delegate;
            if (anonymousClass13 != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.prepareEditText(richEditText);
                richEditorListView.delegate.makeEditTextFocusable(richEditText);
            }
        }

        @Override
        public final boolean onSelectAll() {
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || richDetailsCell.currentRow == null) {
                return false;
            }
            return RichEditorListView.this.tryEscalateSelectAll();
        }

        @Override
        public final void onSelectionChanged(RichEditText richEditText, int i, int i2) {
            RichEditorListView.AnonymousClass13 anonymousClass13;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            if (richDetailsCell.hijackingSelection || i == i2 || (anonymousClass13 = richDetailsCell.delegate) == null || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null) {
                return;
            }
            if (textSelectionHelper.isInSelectionMode() && textSelectionHelper.getSelectedCell() == richDetailsCell) {
                return;
            }
            richDetailsCell.post(new ChatActivity$$ExternalSyntheticLambda153(this, richEditText, i2, textSelectionHelper, i, 4));
        }

        @Override
        public final void onTab(boolean z) {
        }

        @Override
        public final void onTextChanged(Editable editable) {
            RichDetailsCell richDetailsCell = RichDetailsCell.this;
            BlockRow blockRow = richDetailsCell.currentRow;
            if (blockRow != null) {
                blockRow.titleAutoBoldInitialized = true;
                blockRow.titleAutoBold = richDetailsCell.editText.autoBold;
            }
            if (blockRow != null) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    ((TL_iv.pageBlockDetails) pageBlock).title = RichTextStyle.fromSpannable(editable);
                }
            }
            RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
            if (anonymousClass13 == null || richDetailsCell.currentRow == null) {
                return;
            }
            RichEditorListView richEditorListView = RichEditorListView.this;
            RichEditorHistory richEditorHistory = richEditorListView.history;
            if (richEditorHistory != null) {
                richEditorHistory.onTyping();
            }
            richEditorListView.delegate.onContentChanged();
        }

        @Override
        public final void onTextWillChange(int i, int i2) {
        }
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            RichDetailsCell richDetailsCell = (RichDetailsCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            RichEditorListView.AnonymousClass13 anonymousClass13 = (RichEditorListView.AnonymousClass13) uItem.object2;
            boolean z2 = richDetailsCell.currentRow != blockRow;
            richDetailsCell.currentRow = blockRow;
            richDetailsCell.delegate = anonymousClass13;
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                richDetailsCell.arrow.setAnimationProgressAnimated(pageblockdetails.open ? 0.0f : 1.0f);
                SpannableStringBuilder spannable = RichTextStyle.toSpannable(pageblockdetails.title, null);
                if (!blockRow.titleAutoBoldInitialized) {
                    blockRow.titleAutoBoldInitialized = true;
                    blockRow.titleAutoBold = spannable.length() == 0 || (RichTextStyle.stylesFullyCovering(spannable, 0, spannable.length()) & 1) != 0;
                }
                boolean z3 = blockRow.titleAutoBold;
                RichEditText richEditText = richDetailsCell.editText;
                richEditText.setAutoBold(z3);
                if (z2 || !String.valueOf(richEditText.getText()).equals(RichTextStyle.plainOf(pageblockdetails.title))) {
                    richEditText.setTextSilently(spannable);
                    richEditText.invalidateEffects();
                }
            }
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichDetailsCell(context, resourcesProvider);
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public RichDetailsCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerPaint = new Paint();
        this.resourcesProvider = resourcesProvider;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(Theme.getColor(Theme.key_chat_inArticleDetailsArrow, resourcesProvider), 12.66f, 6.16f, 1.66f);
        this.arrow = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new AnonymousClass1(this, 0));
        MuteButton.AnonymousClass1 anonymousClass1 = new MuteButton.AnonymousClass1(this, context, 7);
        this.arrowView = anonymousClass1;
        anonymousClass1.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 29));
        addView(anonymousClass1, LayoutHelper.createFrame(53, -1, 51));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setAllowNewlines(false);
        richEditText.setTextSize(1, SharedConfig.fontSize);
        richEditText.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        richEditText.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        richEditText.setListener(new AnonymousClass3());
        richEditText.setDelegate(new RichEditor$3$$ExternalSyntheticLambda0(this, 8));
        addView(richEditText, LayoutHelper.createFrame(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RichEditorListView.AnonymousClass13 anonymousClass13 = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = anonymousClass13 != null ? RichEditorListView.this.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            RichEditText richEditText = this.editText;
            if (richEditText.getLayout() != null) {
                canvas.save();
                canvas.translate(richEditText.getPaddingLeft() + richEditText.getLeft(), richEditText.getPaddingTop() + richEditText.getTop());
                textSelectionHelper.draw(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        RichEditText richEditText = this.editText;
        final Layout layout = richEditText.getLayout();
        if (layout == null) {
            return;
        }
        final int paddingLeft = richEditText.getPaddingLeft() + richEditText.getLeft();
        final int paddingTop = richEditText.getPaddingTop() + richEditText.getTop();
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
            @Override
            public final Layout getLayout() {
                return layout;
            }

            @Override
            public final CharSequence getPrefix() {
                return null;
            }

            @Override
            public final int getRow() {
                return 0;
            }

            @Override
            public final Rect getSelectionBounds() {
                return null;
            }

            @Override
            public final CharSequence getText() {
                BlockRow blockRow = RichDetailsCell.this.currentRow;
                if (blockRow == null) {
                    return "";
                }
                TL_iv.PageBlock pageBlock = blockRow.block;
                return pageBlock instanceof TL_iv.pageBlockDetails ? RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) pageBlock).title, null) : "";
            }

            @Override
            public final int getX() {
                return paddingLeft;
            }

            @Override
            public final int getY() {
                return paddingTop;
            }
        });
    }

    public int[] getColorKeys() {
        return null;
    }

    public RichEditText getEditText() {
        return this.editText;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public final void onDraw(Canvas canvas) {
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
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
    }

    @Override
    public final void updateColors() {
        this.editText.updateColors();
        int i = Theme.key_chat_inArticleDetailsArrow;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.arrow.setColor(Theme.getColor(i, resourcesProvider));
        this.dividerPaint.setColor(Theme.getColor(Theme.key_chat_inArticleDetailsLine, resourcesProvider));
    }
}
