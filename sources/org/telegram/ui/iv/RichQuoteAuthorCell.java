package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;

public final class RichQuoteAuthorCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    public final RichEditText authorEditText;
    public Delegate delegate;
    public boolean hijackingSelection;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList tmpBlocks;

    public interface Delegate {
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            TL_iv.RichText richText;
            RichQuoteAuthorCell richQuoteAuthorCell = (RichQuoteAuthorCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            Delegate delegate = (Delegate) uItem.object2;
            richQuoteAuthorCell.currentRow = blockRow;
            richQuoteAuthorCell.delegate = delegate;
            richQuoteAuthorCell.setBlockPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            richQuoteAuthorCell.bindBlockInset(blockRow);
            if (delegate != null) {
                richText = (TL_iv.RichText) RichEditorListView.this.quoteAuthors.get(Long.valueOf(blockRow.authorQuoteId));
            } else {
                richText = null;
            }
            String strPlainOf = RichTextStyle.plainOf(richText);
            RichEditText richEditText = richQuoteAuthorCell.authorEditText;
            if (String.valueOf(richEditText.getText()).equals(strPlainOf)) {
                return;
            }
            richEditText.setTextSilently(Emoji.replaceEmoji(RichTextStyle.toSpannable(richText, null), richEditText.getPaint().getFontMetricsInt(), false));
            richEditText.invalidateEffects();
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichQuoteAuthorCell(context, resourcesProvider);
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
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
        richEditText.setListener(new PhotoViewer.AnonymousClass24(this, 12));
        richEditText.setDelegate(new TodoItemMenu$$ExternalSyntheticLambda3(this, 15));
        addView(richEditText, LayoutHelper.createFrame(-1, -2, 51));
        updateColors$1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = delegate != null ? RichEditorListView.this.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.tmpBlocks;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) arrayList.get(i);
                canvas.save();
                canvas.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
                textSelectionHelper.draw(canvas, this, i);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        RichEditText richEditText = this.authorEditText;
        Layout layout = richEditText.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new RichTextCell.AnonymousClass4(layout, richEditText.getPaddingLeft() + richEditText.getLeft(), richEditText.getPaddingTop() + richEditText.getTop(), 1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public final void persist() {
        BlockRow blockRow;
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        long j = blockRow.authorQuoteId;
        TL_iv.RichText richTextFromSpannable = RichTextStyle.fromSpannable(this.authorEditText.getText());
        RichEditorListView richEditorListView = RichEditorListView.this;
        if (richTextFromSpannable == null || (richTextFromSpannable instanceof TL_iv.textEmpty)) {
            richEditorListView.quoteAuthors.remove(Long.valueOf(j));
        } else {
            richEditorListView.quoteAuthors.put(Long.valueOf(j), richTextFromSpannable);
        }
    }

    @Override
    public final void updateColors$1() {
        RichEditText richEditText = this.authorEditText;
        richEditText.updateColors();
        int i = Theme.key_featuredStickers_addButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        richEditText.setTextColor(Theme.getColor(i, resourcesProvider));
        richEditText.setHintTextColor(Theme.multAlpha(0.5f, Theme.getColor(i, resourcesProvider)));
    }
}
