package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda19;

public final class RichCaptionController {
    public final RichEditText editText;
    public boolean hijackingSelection;
    public final Host host;
    public final Theme.ResourcesProvider resourcesProvider;

    public interface Host {
        TextSelectionHelper.ArticleSelectableView cell();

        BlockRow currentRow();

        void onCaptionChanged();

        void onCaptionEnter();

        void onCaptionLockedInsert(CharSequence charSequence);

        boolean onCaptionSelectAll();

        void onCaptionSpansChanged();

        void onCaptionWillChange(int i, int i2);

        void onRequestWindowFocusable(RichEditText richEditText);

        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper();
    }

    public RichCaptionController(Context context, Theme.ResourcesProvider resourcesProvider, Host host) {
        this.resourcesProvider = resourcesProvider;
        this.host = host;
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        richEditText.setAllowNewlines(false);
        richEditText.setInputType(147457);
        richEditText.setGravity(8388659);
        richEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        richEditText.setHint(LocaleController.getString(R.string.AddCaption));
        richEditText.setListener(new PhotoViewer.AnonymousClass14(13, this, host));
        richEditText.setDelegate(new TodoItemMenu$$ExternalSyntheticLambda19(10, this, host));
        applyColors();
    }

    public static void ensureCaption(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.caption == null) {
            pageBlock.caption = new TL_iv.PageCaption();
        }
        TL_iv.PageCaption pageCaption = pageBlock.caption;
        if (pageCaption.text == null) {
            pageCaption.text = new TL_iv.textEmpty();
        }
        TL_iv.PageCaption pageCaption2 = pageBlock.caption;
        if (pageCaption2.credit == null) {
            pageCaption2.credit = new TL_iv.textEmpty();
        }
    }

    public final void applyColors() {
        RichEditText richEditText = this.editText;
        richEditText.updateColors();
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
        richEditText.setTextColor(Theme.multAlpha(0.5f, color));
        richEditText.setHintTextColor(Theme.multAlpha(0.35f, color));
    }

    public final void bind() {
        TL_iv.PageBlock pageBlock;
        BlockRow blockRowCurrentRow = this.host.currentRow();
        if (blockRowCurrentRow == null || (pageBlock = blockRowCurrentRow.block) == null) {
            return;
        }
        ensureCaption(pageBlock);
        TL_iv.RichText richText = blockRowCurrentRow.block.caption.text;
        String strPlainOf = RichTextStyle.plainOf(richText);
        RichEditText richEditText = this.editText;
        if (String.valueOf(richEditText.getText()).equals(strPlainOf)) {
            return;
        }
        richEditText.setTextSilently(RichTextStyle.toSpannable(richText, null));
        richEditText.invalidateEffects();
    }

    public final void drawSelection(Canvas canvas) {
        Host host = this.host;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelperSelectionHelper = host.selectionHelper();
        if (articleTextSelectionHelperSelectionHelper != null) {
            RichEditText richEditText = this.editText;
            if (richEditText.getLayout() == null) {
                return;
            }
            canvas.save();
            canvas.translate(richEditText.getPaddingLeft() + richEditText.getLeft(), richEditText.getPaddingTop() + richEditText.getTop());
            articleTextSelectionHelperSelectionHelper.draw(canvas, host.cell(), 0);
            canvas.restore();
        }
    }

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
                TL_iv.PageBlock pageBlock;
                TL_iv.PageCaption pageCaption;
                TL_iv.RichText richText;
                BlockRow blockRowCurrentRow = RichCaptionController.this.host.currentRow();
                return (blockRowCurrentRow == null || (pageBlock = blockRowCurrentRow.block) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : RichTextStyle.toSpannable(richText, null);
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

    public final boolean isPressOnCaption(int i, int i2) {
        int lineForVertical;
        RichEditText richEditText = this.editText;
        Layout layout = richEditText.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i - (richEditText.getPaddingLeft() + richEditText.getLeft());
        int paddingTop = i2 - (richEditText.getPaddingTop() + richEditText.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f = paddingLeft;
            if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void layout(int i, int i2, int i3, int i4) {
        int iDp = AndroidUtilities.dp(16.0f) + i;
        int iMax = Math.max(iDp, (i3 - i2) - AndroidUtilities.dp(16.0f));
        RichEditText richEditText = this.editText;
        richEditText.layout(iDp, i4, iMax, richEditText.getMeasuredHeight() + i4);
    }

    public final int measure(int i, int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - i2) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        RichEditText richEditText = this.editText;
        richEditText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        return richEditText.getMeasuredHeight();
    }

    public final void persist() {
        TL_iv.PageBlock pageBlock;
        BlockRow blockRowCurrentRow = this.host.currentRow();
        if (blockRowCurrentRow == null || (pageBlock = blockRowCurrentRow.block) == null) {
            return;
        }
        ensureCaption(pageBlock);
        blockRowCurrentRow.block.caption.text = RichTextStyle.fromSpannable(this.editText.getText());
    }
}
