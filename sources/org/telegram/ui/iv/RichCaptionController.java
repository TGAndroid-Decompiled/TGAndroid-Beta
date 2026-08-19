package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Editable;
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
import org.telegram.ui.Components.EditTextCaption;

class RichCaptionController {
    final RichEditText editText;
    private boolean hijackingSelection;
    private final Host host;
    private final Theme.ResourcesProvider resourcesProvider;

    interface Host {
        TextSelectionHelper.ArticleSelectableView cell();

        BlockRow currentRow();

        void onCaptionChanged();

        void onCaptionEnter();

        void onCaptionLockedInsert(CharSequence charSequence);

        boolean onCaptionSelectAll();

        void onCaptionSpansChanged();

        void onCaptionWillChange(int i, int i2);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper();
    }

    RichCaptionController(Context context, Theme.ResourcesProvider resourcesProvider, final Host host) {
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
        richEditText.setListener(new AnonymousClass1(host));
        richEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
            @Override
            public final void onSpansChanged() {
                RichCaptionController.$r8$lambda$n1sUuvU1MNhRn1Nf4OolbWszShQ(this.f$0, host);
            }
        });
        applyColors();
    }

    class AnonymousClass1 implements RichEditText.Listener {
        final Host val$host;

        @Override
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onBackspaceAtStart(this, richEditText);
        }

        @Override
        public void onBackspaceOnEmpty(RichEditText richEditText) {
            RichEditText.Listener.CC.$default$onBackspaceOnEmpty(this, richEditText);
        }

        @Override
        public boolean onPaste(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onPaste(this, richEditText);
        }

        @Override
        public boolean onTab(RichEditText richEditText, boolean z) {
            return RichEditText.Listener.CC.$default$onTab(this, richEditText, z);
        }

        AnonymousClass1(Host host) {
            this.val$host = host;
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            this.val$host.onCaptionEnter();
        }

        @Override
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            this.val$host.onCaptionWillChange(i, i2);
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            RichCaptionController.this.persist();
            this.val$host.onCaptionChanged();
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            this.val$host.onRequestWindowFocusable(richEditText, z);
        }

        @Override
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            this.val$host.onCaptionLockedInsert(charSequence);
        }

        @Override
        public boolean onSelectAll(RichEditText richEditText) {
            return this.val$host.onCaptionSelectAll();
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelperSelectionHelper;
            if (RichCaptionController.this.hijackingSelection || i == i2 || (articleTextSelectionHelperSelectionHelper = this.val$host.selectionHelper()) == null) {
                return;
            }
            if (articleTextSelectionHelperSelectionHelper.isInSelectionMode() && articleTextSelectionHelperSelectionHelper.getSelectedCell() == this.val$host.cell()) {
                return;
            }
            final Host host = this.val$host;
            richEditText.post(new Runnable() {
                @Override
                public final void run() {
                    RichCaptionController.AnonymousClass1.$r8$lambda$I_EWBiPSH2lv4l0Ypt9TL6n5u80(this.f$0, richEditText, i2, articleTextSelectionHelperSelectionHelper, host, i);
                }
            });
        }

        public static void $r8$lambda$I_EWBiPSH2lv4l0Ypt9TL6n5u80(AnonymousClass1 anonymousClass1, RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, Host host, int i2) {
            anonymousClass1.getClass();
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd() || !articleTextSelectionHelper.selectRangeOf(host.cell(), 0, i2, i)) {
                return;
            }
            RichCaptionController.this.hijackingSelection = true;
            richEditText.setSelection(i);
            RichCaptionController.this.hijackingSelection = false;
        }
    }

    public static void $r8$lambda$n1sUuvU1MNhRn1Nf4OolbWszShQ(RichCaptionController richCaptionController, Host host) {
        richCaptionController.persist();
        host.onCaptionSpansChanged();
    }

    static void ensureCaption(TL_iv.PageBlock pageBlock) {
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

    void bind() {
        TL_iv.PageBlock pageBlock;
        BlockRow blockRowCurrentRow = this.host.currentRow();
        if (blockRowCurrentRow == null || (pageBlock = blockRowCurrentRow.block) == null) {
            return;
        }
        ensureCaption(pageBlock);
        TL_iv.RichText richText = blockRowCurrentRow.block.caption.text;
        if (String.valueOf(this.editText.getText()).equals(RichTextStyle.plainOf(richText))) {
            return;
        }
        this.editText.setTextSilently(RichTextStyle.toSpannable(richText));
        this.editText.invalidateEffects();
    }

    void persist() {
        TL_iv.PageBlock pageBlock;
        BlockRow blockRowCurrentRow = this.host.currentRow();
        if (blockRowCurrentRow == null || (pageBlock = blockRowCurrentRow.block) == null) {
            return;
        }
        ensureCaption(pageBlock);
        blockRowCurrentRow.block.caption.text = RichTextStyle.fromSpannable(this.editText.getText());
    }

    void applyColors() {
        this.editText.updateColors();
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
        this.editText.setTextColor(Theme.multAlpha(color, 0.5f));
        this.editText.setHintTextColor(Theme.multAlpha(color, 0.35f));
    }

    int measure(int i, int i2, int i3) {
        this.editText.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - i2) - (AndroidUtilities.dp(16.0f) * 2)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.editText.getMeasuredHeight();
    }

    void layout(int i, int i2, int i3, int i4) {
        int iDp = i + AndroidUtilities.dp(16.0f);
        this.editText.layout(iDp, i4, Math.max(iDp, (i3 - i2) - AndroidUtilities.dp(16.0f)), this.editText.getMeasuredHeight() + i4);
    }

    void fillTextLayoutBlocks(ArrayList arrayList) {
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
                TL_iv.PageBlock pageBlock;
                TL_iv.PageCaption pageCaption;
                TL_iv.RichText richText;
                BlockRow blockRowCurrentRow = RichCaptionController.this.host.currentRow();
                if (blockRowCurrentRow == null || (pageBlock = blockRowCurrentRow.block) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) {
                    return "";
                }
                return RichTextStyle.toSpannable(richText);
            }
        });
    }

    void drawSelection(Canvas canvas) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelperSelectionHelper = this.host.selectionHelper();
        if (articleTextSelectionHelperSelectionHelper == null || this.editText.getLayout() == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.editText.getLeft() + this.editText.getPaddingLeft(), this.editText.getTop() + this.editText.getPaddingTop());
        articleTextSelectionHelperSelectionHelper.draw(canvas, this.host.cell(), 0);
        canvas.restore();
    }

    boolean isPressOnCaption(int i, int i2) {
        int lineForVertical;
        Layout layout = this.editText.getLayout();
        if (layout == null) {
            return false;
        }
        int left = i - (this.editText.getLeft() + this.editText.getPaddingLeft());
        int top = i2 - (this.editText.getTop() + this.editText.getPaddingTop());
        if (top >= 0 && top < layout.getHeight() && (lineForVertical = layout.getLineForVertical(top)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f = left;
            if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }
}
