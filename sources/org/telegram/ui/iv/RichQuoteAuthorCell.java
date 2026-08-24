package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichQuoteAuthorCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    final RichEditText authorEditText;
    private Delegate delegate;
    private boolean hijackingSelection;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList tmpBlocks;

    public interface Delegate {
        TL_iv.RichText getQuoteAuthor(long j);

        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onQuoteAuthorEnter(BlockRow blockRow);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        void setQuoteAuthor(long j, TL_iv.RichText richText);
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public RichQuoteAuthorCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.resourcesProvider = resourcesProvider;
        setBlockPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.authorEditText = richEditText;
        richEditText.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        richEditText.setAllowNewlines(false);
        richEditText.setInputType(147457);
        richEditText.setGravity(8388659);
        richEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        richEditText.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        richEditText.setTextColorKey(Theme.key_featuredStickers_addButton);
        richEditText.setAccentHint(true);
        richEditText.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        richEditText.setListener(new AnonymousClass1());
        richEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
            @Override
            public final void onSpansChanged() {
                this.f$0.persist();
            }
        });
        addView(richEditText, LayoutHelper.createFrame(-1, -2, 51));
        updateColors();
    }

    class AnonymousClass1 implements RichEditText.Listener {
        @Override
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onBackspaceAtStart(this, richEditText);
        }

        @Override
        public void onBackspaceOnEmpty(RichEditText richEditText) {
            RichEditText.Listener.CC.$default$onBackspaceOnEmpty(this, richEditText);
        }

        @Override
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            RichEditText.Listener.CC.$default$onLockedInsert(this, richEditText, charSequence);
        }

        @Override
        public boolean onPaste(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onPaste(this, richEditText);
        }

        @Override
        public boolean onSelectAll(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onSelectAll(this, richEditText);
        }

        @Override
        public boolean onTab(RichEditText richEditText, boolean z) {
            return RichEditText.Listener.CC.$default$onTab(this, richEditText, z);
        }

        @Override
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            RichEditText.Listener.CC.$default$onTextWillChange(this, richEditText, i, i2);
        }

        AnonymousClass1() {
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            if (RichQuoteAuthorCell.this.delegate != null) {
                RichQuoteAuthorCell richQuoteAuthorCell = RichQuoteAuthorCell.this;
                if (richQuoteAuthorCell.currentRow != null) {
                    richQuoteAuthorCell.delegate.onQuoteAuthorEnter(RichQuoteAuthorCell.this.currentRow);
                }
            }
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            RichQuoteAuthorCell.this.persist();
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichQuoteAuthorCell.this.delegate != null) {
                RichQuoteAuthorCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichQuoteAuthorCell.this.hijackingSelection || i == i2 || RichQuoteAuthorCell.this.delegate == null || (selectionHelper = RichQuoteAuthorCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            richEditText.post(new Runnable() {
                @Override
                public final void run() {
                    RichQuoteAuthorCell.AnonymousClass1.m5014$r8$lambda$lsMMXJGkHCkQyF1Y50cn_0jhYY(this.f$0, richEditText, i2, selectionHelper, i);
                }
            });
        }

        public static void m5014$r8$lambda$lsMMXJGkHCkQyF1Y50cn_0jhYY(AnonymousClass1 anonymousClass1, RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            anonymousClass1.getClass();
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd()) {
                return;
            }
            if (articleTextSelectionHelper.isInSelectionMode()) {
                RichQuoteAuthorCell.this.hijackingSelection = true;
                richEditText.setSelection(i);
                RichQuoteAuthorCell.this.hijackingSelection = false;
            } else if (articleTextSelectionHelper.selectRangeOf(RichQuoteAuthorCell.this, 0, i2, i)) {
                RichQuoteAuthorCell.this.hijackingSelection = true;
                richEditText.setSelection(i);
                RichQuoteAuthorCell.this.hijackingSelection = false;
            }
        }
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        setBlockPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        bindBlockInset(blockRow);
        TL_iv.RichText quoteAuthor = delegate != null ? delegate.getQuoteAuthor(blockRow.authorQuoteId) : null;
        if (String.valueOf(this.authorEditText.getText()).equals(RichTextStyle.plainOf(quoteAuthor))) {
            return;
        }
        this.authorEditText.setTextSilently(Emoji.replaceEmoji(RichTextStyle.toSpannable(quoteAuthor), this.authorEditText.getPaint().getFontMetricsInt(), false));
        this.authorEditText.invalidateEffects();
    }

    public void persist() {
        BlockRow blockRow;
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.setQuoteAuthor(blockRow.authorQuoteId, RichTextStyle.fromSpannable(this.authorEditText.getText()));
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout = this.authorEditText.getLayout();
        if (layout == null) {
            return;
        }
        final int left = this.authorEditText.getLeft() + this.authorEditText.getPaddingLeft();
        final int top = this.authorEditText.getTop() + this.authorEditText.getPaddingTop();
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
                return layout.getText();
            }
        });
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper != null) {
            this.tmpBlocks.clear();
            fillTextLayoutBlocks(this.tmpBlocks);
            for (int i = 0; i < this.tmpBlocks.size(); i++) {
                TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) this.tmpBlocks.get(i);
                canvas.save();
                canvas.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
                selectionHelper.draw(canvas, this, i);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void updateColors() {
        this.authorEditText.updateColors();
        RichEditText richEditText = this.authorEditText;
        int i = Theme.key_featuredStickers_addButton;
        richEditText.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.authorEditText.setHintTextColor(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.5f));
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
        public RichQuoteAuthorCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichQuoteAuthorCell(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichQuoteAuthorCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}
