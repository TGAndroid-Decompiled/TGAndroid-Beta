package org.telegram.ui.iv;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda171;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessageContainsEmojiButton;
import org.telegram.ui.Components.QuoteCollapseButton;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class RichTextCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    public static final int $r8$clinit = 0;
    public boolean applyingCollapsedDecoration;
    public final RichEditText authorEditText;
    public final Paint bgPaint;
    public final IntroActivity.AnonymousClass4 bullet;
    public final RichDetailsCell.AnonymousClass2 checkBoxView;
    public QuoteCollapseButton collapseButton;
    public final RectF collapseButtonBounds;
    public boolean collapseButtonPressed;
    public int collapseExtraHeight;
    public CollapsedTextPart collapsedPart;
    public int collapsedPartEnd;
    public int collapsedPartStart;
    public BlockRow currentRow;
    public Delegate delegate;
    public final RichEditText editText;
    public boolean forceHint;
    public int highlightGeneration;
    public RichTextCell$$ExternalSyntheticLambda7 highlightScheduled;
    public String highlightedSnapshot;
    public boolean hijackingAuthorSelection;
    public boolean hijackingSelection;
    public final View indentSpacer;
    public LinearLayout languageButton;
    public ImageView languageButtonIcon;
    public TextView languageButtonText;
    public Drawable quoteIcon;
    public ReplyMessageLine quoteLine;
    public final Theme.ResourcesProvider resourcesProvider;
    public final LinearLayout row;
    public boolean showCommandBackground;
    public final ArrayList tmpBlocks;

    public final class AnonymousClass2 implements RichEditText.Listener {
        public AnonymousClass2() {
        }

        @Override
        public final boolean onBackspaceAtStart(RichEditText richEditText) {
            BlockRow blockRow;
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || (blockRow = richTextCell.currentRow) == null) {
                return false;
            }
            return RichEditorListView.this.onCellBackspaceAtStart(blockRow, false);
        }

        @Override
        public final void onBackspaceOnEmpty() {
            BlockRow blockRow;
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || (blockRow = richTextCell.currentRow) == null) {
                return;
            }
            RichEditorListView.this.onCellBackspaceAtStart(blockRow, true);
        }

        @Override
        public final void onEnterPressed(RichEditText richEditText) {
            SpannableStringBuilder styledText;
            int length;
            Editable editable;
            boolean z;
            int i;
            RichEditText editText;
            Editable text;
            Editable text2;
            RichTextCell richTextCell = RichTextCell.this;
            if (richTextCell.delegate == null || richTextCell.currentRow == null) {
                return;
            }
            String string = richEditText.getText().toString();
            RichEditorListView.this.delegate.onSlashSuggest(richTextCell, null);
            String strAccess$200 = RichTextCell.access$200(string);
            if (strAccess$200 != null) {
                ArrayList arrayListMatch = RichCommand.match(strAccess$200);
                if (!arrayListMatch.isEmpty()) {
                    richTextCell.selectCommand((RichCommand) arrayListMatch.get(0));
                    return;
                }
            }
            int iMatchCommand = RichTextCell.matchCommand(richEditText.getText().toString());
            if (iMatchCommand != 0) {
                ((RichEditorListView.AnonymousClass14) richTextCell.delegate).onCommand(richTextCell.currentRow, iMatchCommand);
                return;
            }
            Transform transformMatchEnterTrigger = RichTextCell.matchEnterTrigger(richTextCell.currentRow, richEditText.getText().toString());
            if (transformMatchEnterTrigger != null) {
                Delegate delegate = richTextCell.delegate;
                BlockRow blockRow = richTextCell.currentRow;
                RichEditorListView.AnonymousClass14 anonymousClass14 = (RichEditorListView.AnonymousClass14) delegate;
                anonymousClass14.getClass();
                TL_iv.PageBlock pageBlock = transformMatchEnterTrigger.block;
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    RichEditorListView.this.applyQuote(blockRow);
                    return;
                } else {
                    RichEditorListView.this.transformRow(blockRow, pageBlock, transformMatchEnterTrigger.level, transformMatchEnterTrigger.num, transformMatchEnterTrigger.checkbox, transformMatchEnterTrigger.checked);
                    return;
                }
            }
            if ((richTextCell.currentRow.block instanceof TL_iv.pageBlockPullquote) && richTextCell.editText.length() > 0) {
                BlockRow blockRow2 = richTextCell.currentRow;
                if (blockRow2 != null) {
                    TL_iv.PageBlock pageBlock2 = blockRow2.block;
                    if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock2;
                        if (pageblockblockquote.caption == null) {
                            pageblockblockquote.caption = new TL_iv.textEmpty();
                        }
                    } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                        TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock2;
                        if (pageblockpullquote.caption == null) {
                            pageblockpullquote.caption = new TL_iv.textEmpty();
                        }
                    }
                }
                RichEditText richEditText2 = richTextCell.authorEditText;
                if (richEditText2.getVisibility() != 0) {
                    richEditText2.setVisibility(0);
                    richTextCell.requestLayout();
                }
                richEditText2.requestEditFocus();
                richEditText2.setSelection(richEditText2.length());
                return;
            }
            Delegate delegate2 = richTextCell.delegate;
            BlockRow blockRow3 = richTextCell.currentRow;
            RichEditorListView richEditorListView = RichEditorListView.this;
            ArrayList arrayList = richEditorListView.rows;
            int iIndexOf = arrayList.indexOf(blockRow3);
            if (iIndexOf < 0) {
                return;
            }
            RichEditorHistory richEditorHistory = richEditorListView.history;
            if (richEditorHistory != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                richEditorHistory.commit();
            }
            View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow3);
            boolean z2 = viewFindViewByItemObject instanceof RichTextCell;
            if (z2) {
                RichEditText editText2 = ((RichTextCell) viewFindViewByItemObject).getEditText();
                text2 = editText2.getText();
                length = editText2.getSelectionEnd();
            } else {
                styledText = RichTextCell.readStyledText(blockRow3.block);
                length = styledText.length();
            }
            if (length >= 0) {
                editable = styledText;
                if (length > editable.length()) {
                    editable = styledText;
                    editable = text2;
                    editable = text2;
                    length = editable.length();
                }
            } else {
                editable = styledText;
                editable = text2;
                editable = text2;
                length = editable.length();
            }
            editable = text2;
            int length2 = editable.length();
            UniversalAdapter universalAdapter = richEditorListView.adapter;
            if (length2 == 0) {
                if (!blockRow3.quoteIds.isEmpty()) {
                    ArrayList arrayList2 = blockRow3.quoteIds;
                    arrayList2.remove(arrayList2.size() - 1);
                    richEditorListView.renumberAllRuns();
                    universalAdapter.update(false);
                    RichEditorHistory richEditorHistory2 = richEditorListView.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda2(richEditorListView, blockRow3, 27));
                    return;
                }
                if (blockRow3.level > 0) {
                    richEditorListView.cascadeOutdent(iIndexOf);
                    richEditorListView.renumberAllRuns();
                    universalAdapter.update(false);
                    RichEditorHistory richEditorHistory3 = richEditorListView.history;
                    if (richEditorHistory3 != null) {
                        richEditorHistory3.record();
                    }
                    richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda2(richEditorListView, blockRow3, 28));
                    return;
                }
            }
            CharSequence charSequenceSubSequence = editable.subSequence(0, length);
            CharSequence charSequenceSubSequence2 = editable.subSequence(length, editable.length());
            TL_iv.PageBlock pageBlock3 = blockRow3.block;
            boolean z3 = pageBlock3 instanceof TL_iv.pageBlockBlockquote;
            ArrayList arrayList3 = blockRow3.quoteIds;
            if (z3) {
                long j = RichContainer.ID_GEN;
                RichContainer.ID_GEN = j + 1;
                TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) pageBlock3).caption;
                if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                    richEditorListView.quoteAuthors.put(Long.valueOf(j), richText);
                }
                arrayList3.add(Long.valueOf(j));
                blockRow3.block = new TL_iv.pageBlockParagraph();
                z = true;
            } else {
                z = false;
            }
            blockRow3.block.text = RichTextStyle.fromSpannable(charSequenceSubSequence);
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = RichTextStyle.fromSpannable(charSequenceSubSequence2);
            int i2 = blockRow3.num;
            if (i2 > 0) {
                i2++;
            }
            BlockRow blockRow4 = new BlockRow(pageblockparagraph, blockRow3.level, i2);
            blockRow4.checkbox = blockRow3.checkbox;
            blockRow4.quoteIds.addAll(arrayList3);
            int i3 = iIndexOf + 1;
            arrayList.add(i3, blockRow4);
            richEditorListView.renumberAllRuns();
            if (z) {
                universalAdapter.update(false);
                RichEditorHistory richEditorHistory4 = richEditorListView.history;
                if (richEditorHistory4 != null) {
                    richEditorHistory4.record();
                }
                richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda2(richEditorListView, blockRow4, 29));
                return;
            }
            if (z2 && (text = (editText = ((RichTextCell) viewFindViewByItemObject).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                editText.ignoreTextChange = true;
                text.delete(length, text.length());
                editText.ignoreTextChange = false;
            }
            universalAdapter.updateWithoutNotify();
            richEditorListView.refreshVisibleListPaddingAround(i3);
            ArrayList arrayList4 = richEditorListView.itemRows;
            int iIndexOf2 = arrayList4.indexOf(blockRow4);
            RecyclerView.AdapterDataObservable adapterDataObservable = universalAdapter.mObservable;
            if (iIndexOf2 < 0) {
                adapterDataObservable.notifyChanged();
            } else {
                RecyclerView.ItemAnimator itemAnimator = richEditorListView.getItemAnimator();
                richEditorListView.setItemAnimator(null);
                adapterDataObservable.notifyItemRangeInserted(iIndexOf2, 1);
                if (blockRow3.num > 0 && (i = iIndexOf2 + 1) < arrayList4.size()) {
                    adapterDataObservable.notifyItemRangeChanged(i, (arrayList4.size() - iIndexOf2) - 1, null);
                }
                richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda85(richEditorListView, itemAnimator, 0));
            }
            RichEditorHistory richEditorHistory5 = richEditorListView.history;
            if (richEditorHistory5 != null) {
                richEditorHistory5.record();
            }
            richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda86(richEditorListView, blockRow4, 0));
        }

        @Override
        public final void onLockedInsert(CharSequence charSequence) {
            Delegate delegate = RichTextCell.this.delegate;
            if (delegate != null) {
                RichEditorListView.AnonymousClass14 anonymousClass14 = (RichEditorListView.AnonymousClass14) delegate;
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }
        }

        @Override
        public final boolean onPaste(RichEditText richEditText) {
            BlockRow blockRow;
            ClipData primaryClip;
            int iIndexOf;
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate != null && (blockRow = richTextCell.currentRow) != null) {
                ArrayList arrayList = RichEditorListView.EMPTY_QUOTE_IDS;
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.getClass();
                ClipboardManager clipboardManager = (ClipboardManager) richEditorListView.getContext().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                    try {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap map = new HashMap();
                            try {
                                ArrayList arrayListResolvePastedMedia = richEditorListView.resolvePastedMedia(RichHtml.parse(htmlText, map));
                                if (!arrayListResolvePastedMedia.isEmpty() && ((arrayListResolvePastedMedia.size() != 1 || !RichEditorListView.isPlainParagraphRow((BlockRow) arrayListResolvePastedMedia.get(0))) && (iIndexOf = richEditorListView.rows.indexOf(blockRow)) >= 0)) {
                                    int iMax = Math.max(0, Math.min(richEditText.getSelectionStart(), richEditText.getSelectionEnd()));
                                    boolean zSpliceBlocksInto = richEditorListView.spliceBlocksInto(iIndexOf, iIndexOf, iMax, Math.max(iMax, Math.max(richEditText.getSelectionStart(), richEditText.getSelectionEnd())), arrayListResolvePastedMedia);
                                    if (zSpliceBlocksInto && !map.isEmpty()) {
                                        richEditorListView.quoteAuthors.putAll(map);
                                    }
                                    return zSpliceBlocksInto;
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return false;
        }

        @Override
        public final void onRequestWindowFocusable(RichEditText richEditText) {
            Delegate delegate = RichTextCell.this.delegate;
            if (delegate != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.prepareEditText(richEditText);
                richEditorListView.delegate.makeEditTextFocusable(richEditText);
            }
        }

        @Override
        public final boolean onSelectAll() {
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || richTextCell.currentRow == null) {
                return false;
            }
            return RichEditorListView.this.tryEscalateSelectAll();
        }

        @Override
        public final void onSelectionChanged(RichEditText richEditText, int i, int i2) {
            Delegate delegate;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            RichTextCell richTextCell = RichTextCell.this;
            if (richTextCell.hijackingSelection || i == i2 || (delegate = richTextCell.delegate) == null || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null) {
                return;
            }
            richTextCell.post(new ChatActivity$$ExternalSyntheticLambda171(this, richEditText, i2, textSelectionHelper, i, 7));
        }

        @Override
        public final void onTab(boolean z) {
            BlockRow blockRow;
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || (blockRow = richTextCell.currentRow) == null) {
                return;
            }
            RichEditorListView.this.onCellIndent(blockRow, z);
        }

        @Override
        public final void onTextChanged(Editable editable) {
            BlockRow blockRow;
            RichTextCell richTextCell = RichTextCell.this;
            if (richTextCell.currentRow == null) {
                return;
            }
            richTextCell.sizeHeaderEmojiToText(editable);
            richTextCell.updateListNumberStyle();
            richTextCell.currentRow.block.text = RichTextStyle.fromSpannable(editable);
            richTextCell.scheduleHighlight();
            richTextCell.updateAuthorVisibility();
            int i = 0;
            if (richTextCell.isBlockquote() && !richTextCell.hasCollapseButton()) {
                ((TL_iv.pageBlockBlockquote) richTextCell.currentRow.block).collapsed = false;
            }
            richTextCell.updateCollapsedDecoration();
            Delegate delegate = richTextCell.delegate;
            if (delegate != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                RichEditorHistory richEditorHistory = richEditorListView.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                richEditorListView.delegate.onContentChanged();
            }
            Delegate delegate2 = richTextCell.delegate;
            if (delegate2 != null) {
                RichEditorListView.this.delegate.onSlashSuggest(richTextCell, RichTextCell.access$200(editable.toString()));
            }
            String string = editable.toString();
            BlockRow blockRow2 = richTextCell.currentRow;
            if (blockRow2 != null && string != null && blockRow2.level == 0 && (blockRow2.block instanceof TL_iv.pageBlockParagraph) && string.equals("> ")) {
                i = 6;
            }
            if (i == 0 || richTextCell.delegate == null) {
                Transform transformMatchMarkdownTrigger = RichTextCell.matchMarkdownTrigger(richTextCell.currentRow, editable.toString());
                if (transformMatchMarkdownTrigger != null && richTextCell.delegate != null) {
                    richTextCell.post(new EglRenderer$$ExternalSyntheticLambda6(this, richTextCell.currentRow, transformMatchMarkdownTrigger, 3));
                }
            } else {
                richTextCell.post(new TodoItemMenu$$ExternalSyntheticLambda2(this, richTextCell.currentRow, i, 19));
            }
            if (richTextCell.showCommandBackground || ((blockRow = richTextCell.currentRow) != null && (blockRow.block instanceof TL_iv.pageBlockPullquote))) {
                richTextCell.invalidate();
            }
        }

        @Override
        public final void onTextWillChange(int i, int i2) {
            RichEditorHistory richEditorHistory;
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || richTextCell.currentRow == null || (richEditorHistory = RichEditorListView.this.history) == null) {
                return;
            }
            richEditorHistory.onBeforeChange(i, i2);
        }
    }

    public final class AnonymousClass3 implements RichEditText.Listener {
        public AnonymousClass3() {
        }

        @Override
        public final boolean onBackspaceAtStart(RichEditText richEditText) {
            RichTextCell richTextCell = RichTextCell.this;
            richTextCell.editText.requestEditFocus();
            RichEditText richEditText2 = richTextCell.editText;
            richEditText2.setSelection(richEditText2.length());
            return true;
        }

        @Override
        public final void onBackspaceOnEmpty() {
        }

        @Override
        public final void onEnterPressed(RichEditText richEditText) {
            BlockRow blockRow;
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || (blockRow = richTextCell.currentRow) == null) {
                return;
            }
            RichEditorListView.this.onCaptionEnter(blockRow);
        }

        @Override
        public final void onLockedInsert(CharSequence charSequence) {
            Delegate delegate = RichTextCell.this.delegate;
            if (delegate != null) {
                RichEditorListView.AnonymousClass14 anonymousClass14 = (RichEditorListView.AnonymousClass14) delegate;
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }
        }

        @Override
        public final boolean onPaste(RichEditText richEditText) {
            return false;
        }

        @Override
        public final void onRequestWindowFocusable(RichEditText richEditText) {
            Delegate delegate = RichTextCell.this.delegate;
            if (delegate != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.prepareEditText(richEditText);
                richEditorListView.delegate.makeEditTextFocusable(richEditText);
            }
        }

        @Override
        public final boolean onSelectAll() {
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || richTextCell.currentRow == null) {
                return false;
            }
            return RichEditorListView.this.tryEscalateSelectAll();
        }

        @Override
        public final void onSelectionChanged(RichEditText richEditText, int i, int i2) {
            Delegate delegate;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            RichTextCell richTextCell = RichTextCell.this;
            if (richTextCell.hijackingAuthorSelection || i == i2 || (delegate = richTextCell.delegate) == null || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null) {
                return;
            }
            richEditText.post(new ChatActivity$$ExternalSyntheticLambda171(this, richEditText, i2, textSelectionHelper, i, 8));
        }

        @Override
        public final void onTab(boolean z) {
        }

        @Override
        public final void onTextChanged(Editable editable) {
            RichTextCell richTextCell = RichTextCell.this;
            if (richTextCell.currentRow == null) {
                return;
            }
            richTextCell.persistAuthor();
            Delegate delegate = richTextCell.delegate;
            if (delegate != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                RichEditorHistory richEditorHistory = richEditorListView.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                richEditorListView.delegate.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = richTextCell.currentRow.block;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                richTextCell.invalidate();
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                richTextCell.invalidate();
                int measuredWidth = richTextCell.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (richTextCell.collapseButtonExtraHeight(measuredWidth, richTextCell.getPaddingBottom() + richTextCell.authorEditText.getMeasuredHeight() + richTextCell.row.getMeasuredHeight() + richTextCell.getPaddingTop()) == richTextCell.collapseExtraHeight) {
                        return;
                    }
                }
                richTextCell.requestLayout();
            }
        }

        @Override
        public final void onTextWillChange(int i, int i2) {
            RichEditorHistory richEditorHistory;
            RichTextCell richTextCell = RichTextCell.this;
            Delegate delegate = richTextCell.delegate;
            if (delegate == null || richTextCell.currentRow == null || (richEditorHistory = RichEditorListView.this.history) == null) {
                return;
            }
            richEditorHistory.onBeforeChange(i, i2);
        }
    }

    public final class AnonymousClass4 implements TextSelectionHelper.TextLayoutBlock {
        public final int $r8$classId;
        public final Layout val$layout;
        public final int val$textX;
        public final int val$textY;

        public AnonymousClass4(Layout layout, int i, int i2, int i3) {
            this.$r8$classId = i3;
            this.val$layout = layout;
            this.val$textX = i;
            this.val$textY = i2;
        }

        @Override
        public final Layout getLayout() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 1:
                    break;
            }
            return this.val$layout;
        }

        @Override
        public final CharSequence getPrefix() {
            switch (this.$r8$classId) {
            }
            return null;
        }

        @Override
        public final int getRow() {
            switch (this.$r8$classId) {
                case 0:
                    return 0;
                case 1:
                    return 0;
                default:
                    return 1;
            }
        }

        @Override
        public final Rect getSelectionBounds() {
            switch (this.$r8$classId) {
            }
            return null;
        }

        @Override
        public final CharSequence getText() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 1:
                    break;
            }
            return this.val$layout.getText();
        }

        @Override
        public final int getX() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 1:
                    break;
            }
            return this.val$textX;
        }

        @Override
        public final int getY() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 1:
                    break;
            }
            return this.val$textY;
        }
    }

    public final class CollapsedTextPart extends CharacterStyle {
        public final int $r8$classId;
        public final Object this$0;

        public CollapsedTextPart(FrameLayout frameLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public final void updateDrawState(TextPaint textPaint) {
            switch (this.$r8$classId) {
                case 0:
                    textPaint.setColor(Theme.blendOver(Theme.multAlpha(0.55f, textPaint.getColor()), Theme.multAlpha(0.4f, Theme.getColor(Theme.key_featuredStickers_addButton, ((RichTextCell) this.this$0).resourcesProvider))));
                    break;
                case 1:
                    textPaint.setTypeface(AndroidUtilities.bold());
                    int alpha = textPaint.getAlpha();
                    int i = Theme.key_windowBackgroundWhiteBlueText;
                    ((MessageContainsEmojiButton) this.this$0).getClass();
                    textPaint.setColor(Theme.getColor(null, i, false));
                    textPaint.setAlpha(alpha);
                    break;
                default:
                    textPaint.setColor(Theme.blendOver(Theme.multAlpha(0.55f, textPaint.getColor()), Theme.multAlpha(0.4f, ((QuoteSpan) this.this$0).color)));
                    break;
            }
        }

        public CollapsedTextPart(QuoteSpan quoteSpan) {
            this.$r8$classId = 2;
            this.this$0 = quoteSpan;
        }
    }

    public interface Delegate {
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichTextCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2, uItem.red);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichTextCell richTextCell = new RichTextCell(context, resourcesProvider);
            richTextCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richTextCell;
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public final class Transform {
        public final TL_iv.PageBlock block;
        public final boolean checkbox;
        public final boolean checked;
        public final int level;
        public final int num;

        public Transform(TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
            this.block = pageBlock;
            this.level = i;
            this.num = i2;
            this.checkbox = z;
            this.checked = z2;
        }
    }

    public RichTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.collapseButtonBounds = new RectF();
        this.collapsedPartStart = -1;
        this.collapsedPartEnd = -1;
        this.bgPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.row = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.indentSpacer = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        IntroActivity.AnonymousClass4 anonymousClass4 = new IntroActivity.AnonymousClass4(this, context);
        this.bullet = anonymousClass4;
        anonymousClass4.setGravity(8388627);
        anonymousClass4.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        anonymousClass4.setSingleLine(true);
        anonymousClass4.setIncludeFontPadding(false);
        anonymousClass4.setTextSize(1, 16.0f);
        linearLayout.addView(anonymousClass4, LayoutHelper.createLinear(18, -2));
        RichDetailsCell.AnonymousClass2 anonymousClass2 = new RichDetailsCell.AnonymousClass2(context, resourcesProvider);
        this.checkBoxView = anonymousClass2;
        anonymousClass2.setVisibility(8);
        anonymousClass2.setOnClickListener(new RichTextCell$$ExternalSyntheticLambda1(this, 0));
        linearLayout.addView(anonymousClass2, LayoutHelper.createLinear(18, -2));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        richEditText.setListener(new AnonymousClass2());
        final int i = 0;
        richEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate(this) {
            public final RichTextCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onSpansChanged() {
                switch (i) {
                    case 0:
                        RichTextCell richTextCell = this.f$0;
                        if (!richTextCell.applyingCollapsedDecoration && richTextCell.currentRow != null) {
                            richTextCell.updateListNumberStyle();
                            richTextCell.currentRow.block.text = RichTextStyle.fromSpannable(richTextCell.editText.getText());
                            RichTextCell.Delegate delegate = richTextCell.delegate;
                            if (delegate != null) {
                                RichEditorListView.access$3700(RichEditorListView.this);
                            }
                        }
                        break;
                    default:
                        RichTextCell richTextCell2 = this.f$0;
                        if (richTextCell2.currentRow != null) {
                            richTextCell2.persistAuthor();
                            RichTextCell.Delegate delegate2 = richTextCell2.delegate;
                            if (delegate2 != null) {
                                RichEditorListView.access$3700(RichEditorListView.this);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        richEditText.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, i));
        linearLayout.addView(richEditText, LayoutHelper.createLinear(1.0f, 0, -2));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 51));
        RichEditText richEditText2 = new RichEditText(context, resourcesProvider);
        this.authorEditText = richEditText2;
        richEditText2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        richEditText2.setAllowNewlines(false);
        richEditText2.setInputType(147457);
        richEditText2.setListener(new AnonymousClass3());
        final int i2 = 1;
        richEditText2.setDelegate(new EditTextCaption.EditTextCaptionDelegate(this) {
            public final RichTextCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onSpansChanged() {
                switch (i2) {
                    case 0:
                        RichTextCell richTextCell = this.f$0;
                        if (!richTextCell.applyingCollapsedDecoration && richTextCell.currentRow != null) {
                            richTextCell.updateListNumberStyle();
                            richTextCell.currentRow.block.text = RichTextStyle.fromSpannable(richTextCell.editText.getText());
                            RichTextCell.Delegate delegate = richTextCell.delegate;
                            if (delegate != null) {
                                RichEditorListView.access$3700(RichEditorListView.this);
                            }
                        }
                        break;
                    default:
                        RichTextCell richTextCell2 = this.f$0;
                        if (richTextCell2.currentRow != null) {
                            richTextCell2.persistAuthor();
                            RichTextCell.Delegate delegate2 = richTextCell2.delegate;
                            if (delegate2 != null) {
                                RichEditorListView.access$3700(RichEditorListView.this);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        richEditText2.setVisibility(8);
        addView(richEditText2, LayoutHelper.createFrame(-1, -2, 51));
        updateColors$1();
    }

    public static String access$200(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
        }
        return null;
    }

    public static TL_iv.RichText extractCaption(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    private String getHint() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return LocaleController.getString(blockRow.firstBlock ? R.string.ArticleHintTitle : R.string.ArticleHeading1);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return LocaleController.getString(R.string.ArticleHeading3);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return LocaleController.getString(R.string.ArticleHeading4);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return LocaleController.getString(R.string.ArticleHeading5);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return LocaleController.getString(R.string.ArticleHeading6);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return LocaleController.getString(R.string.ArticleHintCode);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return LocaleController.getString(R.string.ArticleHintQuote);
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return LocaleController.getString(R.string.ArticleHintQuote);
        }
        if (blockRow.singleParagraph) {
            return LocaleController.getString(R.string.ArticleHintText);
        }
        return null;
    }

    public static boolean isQuoteBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static int matchCommand(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return 4;
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return 5;
        }
        if (lowerCase.equals("/audio") || lowerCase.equals("/music")) {
            return 1;
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            return 2;
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            return 3;
        }
        if (lowerCase.equals("/toggle") || lowerCase.equals("/details")) {
            return 6;
        }
        return lowerCase.equals("/button") ? 7 : 0;
    }

    public static Transform matchEnterTrigger(BlockRow blockRow, String str) {
        int iMax;
        int iMax2;
        char cCharAt;
        char cCharAt2;
        TL_iv.PageBlock pageblockheading1 = null;
        if (str == null || blockRow == null) {
            return null;
        }
        String strTrim = str.trim();
        int i = 2;
        if (strTrim.length() == 3 && (((cCharAt2 = strTrim.charAt(0)) == '-' || cCharAt2 == '*' || cCharAt2 == '_') && strTrim.charAt(1) == cCharAt2 && strTrim.charAt(2) == cCharAt2)) {
            return new Transform(new TL_iv.pageBlockDivider(), 0, 0, false, false);
        }
        String lowerCase = strTrim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (cCharAt = lowerCase.charAt(2)) >= '1' && cCharAt <= '6') {
            switch (cCharAt - '0') {
                case 1:
                    pageblockheading1 = new TL_iv.pageBlockHeading1();
                    break;
                case 2:
                    pageblockheading1 = new TL_iv.pageBlockHeading2();
                    break;
                case 3:
                    pageblockheading1 = new TL_iv.pageBlockHeading3();
                    break;
                case 4:
                    pageblockheading1 = new TL_iv.pageBlockHeading4();
                    break;
                case 5:
                    pageblockheading1 = new TL_iv.pageBlockHeading5();
                    break;
                case 6:
                    pageblockheading1 = new TL_iv.pageBlockHeading6();
                    break;
            }
            return new Transform(pageblockheading1, blockRow.level, blockRow.num, false, false);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new Transform(new TL_iv.pageBlockPreformatted(), 0, 0, false, false);
        }
        if (lowerCase.equals("/footer")) {
            return new Transform(new TL_iv.pageBlockFooter(), 0, 0, false, false);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new Transform(pageblockblockquote, 0, 0, false, false);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new Transform(pageblockpullquote, 0, 0, false, false);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() <= 7) {
            iMax = 2;
        } else {
            String strTrim2 = lowerCase.substring(7).trim();
            int iIndexOf = strTrim2.indexOf(120);
            if (iIndexOf < 0) {
                iIndexOf = strTrim2.indexOf(88);
            }
            if (iIndexOf > 0) {
                try {
                    iMax2 = Math.max(1, Math.min(20, Integer.parseInt(strTrim2.substring(0, iIndexOf).trim())));
                    try {
                        iMax = Math.max(1, Math.min(20, Integer.parseInt(strTrim2.substring(iIndexOf + 1).trim())));
                        i = iMax2;
                    } catch (NumberFormatException unused) {
                        i = iMax2;
                        iMax = 2;
                    }
                } catch (NumberFormatException unused2) {
                    iMax2 = 2;
                }
            } else {
                iMax = 2;
            }
        }
        return new Transform(newEmptyTable(i, iMax), 0, 0, false, false);
    }

    public static Transform matchMarkdownTrigger(BlockRow blockRow, String str) {
        int length;
        char cCharAt;
        TL_iv.PageBlock pageblockheading1 = null;
        if (blockRow != null && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                TL_iv.PageBlock pageBlock = blockRow.block;
                boolean z = pageBlock instanceof TL_iv.pageBlockParagraph;
                boolean z2 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
                if (str.charAt(0) == '#' && (z || z2)) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        if (str.charAt(i3) != '#') {
                            return null;
                        }
                        i2++;
                    }
                    if (i2 < 1 || i2 > 6) {
                        return null;
                    }
                    switch (i2) {
                        case 1:
                            pageblockheading1 = new TL_iv.pageBlockHeading1();
                            break;
                        case 2:
                            pageblockheading1 = new TL_iv.pageBlockHeading2();
                            break;
                        case 3:
                            pageblockheading1 = new TL_iv.pageBlockHeading3();
                            break;
                        case 4:
                            pageblockheading1 = new TL_iv.pageBlockHeading4();
                            break;
                        case 5:
                            pageblockheading1 = new TL_iv.pageBlockHeading5();
                            break;
                        case 6:
                            pageblockheading1 = new TL_iv.pageBlockHeading6();
                            break;
                    }
                    return new Transform(pageblockheading1, blockRow.level, blockRow.num, false, false);
                }
                if (!z) {
                    return null;
                }
                if (blockRow.level == 0 && length == 2) {
                    char cCharAt2 = str.charAt(0);
                    if (cCharAt2 == '-' || cCharAt2 == '*' || cCharAt2 == '+') {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        TL_iv.textPlain textplain = new TL_iv.textPlain();
                        textplain.text = "";
                        pageblockparagraph.text = textplain;
                        return new Transform(pageblockparagraph, 1, 0, false, false);
                    }
                    if (cCharAt2 == '|') {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        return new Transform(pageblockblockquote, 0, 0, false, false);
                    }
                }
                if (blockRow.level == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                    TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                    textplain2.text = "";
                    pageblockparagraph2.text = textplain2;
                    return new Transform(pageblockparagraph2, 1, 0, true, false);
                }
                if (blockRow.level == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                    char cCharAt3 = str.charAt(1);
                    if (cCharAt3 == ' ') {
                        TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                        TL_iv.textPlain textplain3 = new TL_iv.textPlain();
                        textplain3.text = "";
                        pageblockparagraph3.text = textplain3;
                        return new Transform(pageblockparagraph3, 1, 0, true, false);
                    }
                    if (cCharAt3 == 'x' || cCharAt3 == 'X') {
                        TL_iv.pageBlockParagraph pageblockparagraph4 = new TL_iv.pageBlockParagraph();
                        TL_iv.textPlain textplain4 = new TL_iv.textPlain();
                        textplain4.text = "";
                        pageblockparagraph4.text = textplain4;
                        return new Transform(pageblockparagraph4, 1, 0, true, true);
                    }
                }
                if (blockRow.level == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((cCharAt = str.charAt(1)) == '.' || cCharAt == ')')) {
                    TL_iv.pageBlockParagraph pageblockparagraph5 = new TL_iv.pageBlockParagraph();
                    TL_iv.textPlain textplain5 = new TL_iv.textPlain();
                    textplain5.text = "";
                    pageblockparagraph5.text = textplain5;
                    return new Transform(pageblockparagraph5, 1, 1, false, false);
                }
                if (blockRow.level == 0 && length == 4) {
                    char cCharAt4 = str.charAt(0);
                    if ((cCharAt4 == '-' || cCharAt4 == '*' || cCharAt4 == '_') && str.charAt(1) == cCharAt4 && str.charAt(2) == cCharAt4) {
                        return new Transform(new TL_iv.pageBlockDivider(), 0, 0, false, false);
                    }
                    if (cCharAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                        return new Transform(new TL_iv.pageBlockPreformatted(), 0, 0, false, false);
                    }
                }
            }
        }
        return null;
    }

    public static TL_iv.pageBlockTable newEmptyTable(int i, int i2) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i3 = 0; i3 < i; i3++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                ArrayList<TL_iv.pageTableCell> arrayList = pagetablerow.cells;
                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                TableModel.applyPlainText(pagetablecell, "");
                arrayList.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static boolean pressOnLayout(RichEditText richEditText, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = richEditText.getLayout();
        if (layout != null && richEditText.length() != 0) {
            int paddingLeft = i3 - (richEditText.getPaddingLeft() + i);
            int paddingTop = i4 - (richEditText.getPaddingTop() + i2);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int iDp = AndroidUtilities.dp(24.0f);
                int iMax = Math.max(0, (richEditText.getWidth() - richEditText.getPaddingLeft()) - richEditText.getPaddingRight());
                float f = iDp;
                float fMax = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
                float fMin = Math.min(iMax, layout.getLineRight(lineForVertical) + f);
                float f2 = paddingLeft;
                if (f2 >= fMax && f2 <= fMin) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String readPlainText(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return RichTextStyle.plainOf(pageBlock.text);
    }

    public static SpannableStringBuilder readStyledText(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return RichTextStyle.toSpannable(pageBlock.text, pageBlock);
    }

    public final void applyListDecoration(BlockRow blockRow) {
        int iM;
        int i;
        BlockRow blockRow2;
        int i2;
        int i3 = blockRow.level;
        RichDetailsCell.AnonymousClass2 anonymousClass2 = this.checkBoxView;
        View view = this.indentSpacer;
        IntroActivity.AnonymousClass4 anonymousClass4 = this.bullet;
        if (i3 <= 0) {
            view.setVisibility(8);
            anonymousClass4.setVisibility(8);
            anonymousClass2.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i3 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i3 > 1 ? 0 : 8);
        if (blockRow.checkbox) {
            anonymousClass4.setVisibility(8);
            anonymousClass2.setVisibility(0);
            ((CheckBoxBase) anonymousClass2.this$0).setChecked(-1, blockRow.checked, false);
            return;
        }
        anonymousClass2.setVisibility(8);
        anonymousClass4.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) anonymousClass4.getLayoutParams();
        if (blockRow.num == 0) {
            iM = AndroidUtilities.dp(18.0f);
        } else {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                TextPaint paint = anonymousClass4.getPaint();
                RichEditorListView richEditorListView = RichEditorListView.this;
                int iIndexOf = richEditorListView.rows.indexOf(blockRow);
                if (iIndexOf < 0 || (i = blockRow.level) <= 0 || blockRow.num <= 0) {
                    iM = MessageObject$$ExternalSyntheticOutline0.m((int) Math.ceil(paint.measureText(SurfaceContainer$$ExternalSyntheticOutline0.m(blockRow.num, ".", new StringBuilder()))), 10.0f, AndroidUtilities.dp(28.0f));
                } else {
                    int i4 = iIndexOf;
                    while (i4 > 0) {
                        BlockRow blockRow3 = (BlockRow) richEditorListView.rows.get(i4 - 1);
                        int i5 = blockRow3.level;
                        if (i5 < i || (i5 == i && blockRow3.num <= 0)) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= richEditorListView.rows.size() || (i2 = (blockRow2 = (BlockRow) richEditorListView.rows.get(iIndexOf)).level) < i || (i2 == i && blockRow2.num <= 0)) {
                            break;
                        }
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float fMax = 0.0f;
                    while (i4 < iIndexOf) {
                        BlockRow blockRow4 = (BlockRow) richEditorListView.rows.get(i4);
                        if (blockRow4.level == i && blockRow4.num > 0) {
                            fMax = Math.max(fMax, paint2.measureText(blockRow4.num + "."));
                        }
                        i4++;
                    }
                    iM = MessageObject$$ExternalSyntheticOutline0.m((int) Math.ceil(fMax), 10.0f, AndroidUtilities.dp(28.0f));
                }
            } else {
                iM = MessageObject$$ExternalSyntheticOutline0.m((int) Math.ceil(anonymousClass4.getPaint().measureText(blockRow.num + ".")), 10.0f, AndroidUtilities.dp(28.0f));
            }
        }
        if (layoutParams2.width != iM) {
            layoutParams2.width = iM;
            anonymousClass4.setLayoutParams(layoutParams2);
        }
        anonymousClass4.setText(blockRow.num == 0 ? "" : SurfaceContainer$$ExternalSyntheticOutline0.m(blockRow.num, ".", new StringBuilder()));
    }

    public final void bind(BlockRow blockRow, Delegate delegate, boolean z) {
        float f;
        float f2;
        BlockRow blockRow2;
        int iDp;
        int iDp2;
        int i;
        int size;
        int iDp3;
        int iQuoteInsetEnd;
        boolean z2;
        int paddingTop;
        int paddingBottom;
        int i2;
        int i3;
        int iDp4;
        int iDp5;
        TL_iv.PageBlock pageBlock;
        boolean zIsQuoteBlock;
        RichEditText richEditText;
        TL_iv.pageBlockPullquote pageblockpullquote;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        Spanned styledText;
        float f3;
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.forceHint = z;
        this.collapsedPartEnd = -1;
        this.collapsedPartStart = -1;
        TL_iv.PageBlock pageBlock2 = blockRow.block;
        RichEditText richEditText2 = this.editText;
        richEditText2.setBlock(pageBlock2);
        TL_iv.PageBlock pageBlock3 = blockRow.block;
        int i4 = SharedConfig.fontSize;
        richEditText2.setCenterEmptyHint(false);
        richEditText2.setHint(getHint());
        richEditText2.setTextColorKey(Theme.key_windowBackgroundWhiteBlackText);
        richEditText2.setLineSpacing(0.0f, 1.0f);
        if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
            f = 24.0f;
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            richEditText2.setInputType(655505);
            richEditText2.setAllowNewlines(true);
            richEditText2.setSoftEnterNewline(false);
            richEditText2.setGravity(8388659);
            richEditText2.setTextSize(1, i4 - 1);
            richEditText2.setTypeface(Typeface.MONOSPACE);
            richEditText2.setLineSpacing(richEditText2.getPaint().getFontSpacing() * 0.3f, 1.0f);
            richEditText2.setAccentHint(false);
        } else {
            f = 24.0f;
            if (!(pageBlock3 instanceof TL_iv.pageBlockBlockquote)) {
                if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    richEditText2.setInputType(147457);
                    richEditText2.setAllowNewlines(false);
                    richEditText2.setSoftEnterNewline(true);
                    richEditText2.setGravity(49);
                    richEditText2.setCenterEmptyHint(true);
                    setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
                    richEditText2.setTextSize(1, Math.max(8, i4 - 2));
                    richEditText2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                    richEditText2.setAccentHint(true);
                } else {
                    richEditText2.setInputType(147457);
                    richEditText2.setAllowNewlines(false);
                    richEditText2.setSoftEnterNewline(false);
                    richEditText2.setGravity(8388659);
                    boolean z3 = pageBlock3 instanceof TL_iv.pageBlockHeading1;
                    boolean z4 = z3 || (pageBlock3 instanceof TL_iv.pageBlockHeading2) || (pageBlock3 instanceof TL_iv.pageBlockHeading3) || (pageBlock3 instanceof TL_iv.pageBlockHeading4) || (pageBlock3 instanceof TL_iv.pageBlockHeading5) || (pageBlock3 instanceof TL_iv.pageBlockHeading6);
                    f2 = 8.0f;
                    setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z4 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z4 ? 7.0f : 4.66f));
                    BlockRow blockRow3 = this.currentRow;
                    if (blockRow3 != null && blockRow3.level > 0) {
                        int iDp6 = AndroidUtilities.dp(16.0f);
                        Delegate delegate2 = this.delegate;
                        if (delegate2 != null) {
                            BlockRow blockRow4 = this.currentRow;
                            RichEditorListView richEditorListView = RichEditorListView.this;
                            int iIndexOf = richEditorListView.rows.indexOf(blockRow4);
                            iDp = (iIndexOf <= 0 || ((BlockRow) richEditorListView.rows.get(iIndexOf - 1)).level <= 0) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(2.0f);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                        }
                        int iDp7 = AndroidUtilities.dp(16.0f);
                        Delegate delegate3 = this.delegate;
                        if (delegate3 != null) {
                            BlockRow blockRow5 = this.currentRow;
                            RichEditorListView richEditorListView2 = RichEditorListView.this;
                            int iIndexOf2 = richEditorListView2.rows.indexOf(blockRow5);
                            iDp2 = (iIndexOf2 < 0 || (i = iIndexOf2 + 1) >= richEditorListView2.rows.size() || ((BlockRow) richEditorListView2.rows.get(i)).level <= 0) ? AndroidUtilities.dp(11.0f) : AndroidUtilities.dp(5.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(11.0f);
                        }
                        setPadding(iDp6, iDp, iDp7, iDp2);
                    }
                    if (z3) {
                        richEditText2.setTextSize(1, i4 + 3);
                        richEditText2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                        richEditText2.setTextSize(1, i4 + 2);
                        richEditText2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                        richEditText2.setTextSize(1, i4 + 1);
                        richEditText2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                        richEditText2.setTextSize(1, i4);
                        richEditText2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                        richEditText2.setTextSize(1, i4 - 1);
                        richEditText2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                        richEditText2.setTextSize(1, i4 - 2);
                        richEditText2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                        richEditText2.setTextSize(1, i4 - 2);
                        richEditText2.setTypeface(null);
                        richEditText2.setTextColorKey(Theme.key_chat_inReplyMessageText);
                    } else {
                        richEditText2.setTextSize(1, (pageBlock3 instanceof TL_iv.pageBlockParagraph) && (blockRow2 = this.currentRow) != null && !blockRow2.quoteIds.isEmpty() ? Math.max(8, i4 - 2) : i4);
                        richEditText2.setTypeface(null);
                    }
                    richEditText2.setAccentHint(false);
                }
                size = blockRow.quoteIds.size();
                if (size <= 0) {
                    iDp3 = 0;
                } else {
                    iDp3 = AndroidUtilities.dp(zzkv.m(size, 1, 16, 12));
                }
                iQuoteInsetEnd = RichBlockChrome.quoteInsetEnd(blockRow);
                if (iDp3 <= 0 || iQuoteInsetEnd > 0) {
                    z2 = blockRow.block instanceof TL_iv.pageBlockPreformatted;
                    paddingTop = getPaddingTop();
                    paddingBottom = getPaddingBottom();
                    if (blockRow.quoteFirst) {
                        i3 = blockRow.quoteTopEdge;
                        if (i3 <= 0) {
                            iDp4 = 0;
                        } else {
                            iDp4 = AndroidUtilities.dp(zzkv.m(i3, 1, 16, 10));
                        }
                        if (z2) {
                            iDp5 = AndroidUtilities.dp(f);
                        } else {
                            iDp5 = 0;
                        }
                        paddingTop = iDp4 + iDp5;
                    }
                    if (blockRow.quoteLast) {
                        i2 = blockRow.quoteBottomEdge;
                        if (i2 <= 0) {
                            paddingBottom = 0;
                        } else {
                            paddingBottom = AndroidUtilities.dp(zzkv.m(i2, 1, 16, 10));
                        }
                    }
                    if (z2) {
                        iDp3 += AndroidUtilities.dp(f2);
                        iQuoteInsetEnd += AndroidUtilities.dp(f2);
                    }
                    if (LocaleController.isRTL) {
                        setPadding(getPaddingLeft() + iQuoteInsetEnd, paddingTop, getPaddingRight() + iDp3, paddingBottom);
                    } else {
                        setPadding(getPaddingLeft() + iDp3, paddingTop, getPaddingRight() + iQuoteInsetEnd, paddingBottom);
                    }
                }
                applyListDecoration(blockRow);
                updateLanguageButton(blockRow.block, false);
                if (!String.valueOf(richEditText2.getText()).equals(readPlainText(blockRow.block))) {
                    styledText = readStyledText(blockRow.block);
                    if (RichEditorListView.isHeading(blockRow.block)) {
                        SpannableString spannableString = new SpannableString(styledText);
                        RichTextStyle.setStyle(spannableString, 0, spannableString.length(), 1, false, null);
                        RichTextStyle.setStyle(spannableString, 0, spannableString.length(), 2, false, null);
                        styledText = spannableString;
                    }
                    Paint.FontMetricsInt fontMetricsInt = richEditText2.getPaint().getFontMetricsInt();
                    if (RichEditorListView.isHeading(blockRow.block)) {
                        f3 = 0.85f;
                    } else {
                        f3 = 1.0f;
                    }
                    richEditText2.setTextSilently(Emoji.replaceEmoji((CharSequence) styledText, fontMetricsInt, false, f3));
                    sizeHeaderEmojiToText(richEditText2.getText());
                    richEditText2.invalidateEffects();
                    this.highlightedSnapshot = null;
                }
                sizeHeaderEmojiToText(richEditText2.getText());
                updateListNumberStyle();
                pageBlock = blockRow.block;
                zIsQuoteBlock = isQuoteBlock(pageBlock);
                richEditText = this.authorEditText;
                if (zIsQuoteBlock) {
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                        if (pageblockblockquote.caption == null) {
                            pageblockblockquote.caption = new TL_iv.textEmpty();
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                        if (pageblockpullquote.caption == null) {
                            pageblockpullquote.caption = new TL_iv.textEmpty();
                        }
                    }
                    richEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
                    richEditText.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    richEditText.setTextColorKey(Theme.key_featuredStickers_addButton);
                    richEditText.setAccentHint(true);
                    richEditText.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
                    if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        richEditText.setGravity(49);
                    } else {
                        richEditText.setGravity(8388659);
                    }
                    if (!String.valueOf(richEditText.getText()).equals(RichTextStyle.plainOf(extractCaption(pageBlock)))) {
                        richEditText.setTextSilently(Emoji.replaceEmoji(RichTextStyle.toSpannable(extractCaption(pageBlock), null), richEditText.getPaint().getFontMetricsInt(), false));
                        richEditText.invalidateEffects();
                    }
                    updateAuthorVisibility();
                } else {
                    richEditText.setVisibility(8);
                }
                scheduleHighlight();
            }
            richEditText2.setInputType(147457);
            richEditText2.setAllowNewlines(false);
            richEditText2.setSoftEnterNewline(false);
            richEditText2.setGravity(8388659);
            setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
            richEditText2.setTextSize(1, Math.max(8, i4 - 2));
            richEditText2.setTypeface(null);
            richEditText2.setAccentHint(true);
        }
        f2 = 8.0f;
        size = blockRow.quoteIds.size();
        if (size <= 0) {
            iDp3 = 0;
        } else {
            iDp3 = AndroidUtilities.dp(zzkv.m(size, 1, 16, 12));
        }
        iQuoteInsetEnd = RichBlockChrome.quoteInsetEnd(blockRow);
        if (iDp3 <= 0) {
            z2 = blockRow.block instanceof TL_iv.pageBlockPreformatted;
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            if (blockRow.quoteFirst) {
                i3 = blockRow.quoteTopEdge;
                if (i3 <= 0) {
                    iDp4 = 0;
                } else {
                    iDp4 = AndroidUtilities.dp(zzkv.m(i3, 1, 16, 10));
                }
                if (z2) {
                    iDp5 = AndroidUtilities.dp(f);
                } else {
                    iDp5 = 0;
                }
                paddingTop = iDp4 + iDp5;
            }
            if (blockRow.quoteLast) {
                i2 = blockRow.quoteBottomEdge;
                if (i2 <= 0) {
                    paddingBottom = 0;
                } else {
                    paddingBottom = AndroidUtilities.dp(zzkv.m(i2, 1, 16, 10));
                }
            }
            if (z2) {
                iDp3 += AndroidUtilities.dp(f2);
                iQuoteInsetEnd += AndroidUtilities.dp(f2);
            }
            if (LocaleController.isRTL) {
                setPadding(getPaddingLeft() + iQuoteInsetEnd, paddingTop, getPaddingRight() + iDp3, paddingBottom);
            } else {
                setPadding(getPaddingLeft() + iDp3, paddingTop, getPaddingRight() + iQuoteInsetEnd, paddingBottom);
            }
        } else {
            z2 = blockRow.block instanceof TL_iv.pageBlockPreformatted;
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            if (blockRow.quoteFirst) {
                i3 = blockRow.quoteTopEdge;
                if (i3 <= 0) {
                    iDp4 = 0;
                } else {
                    iDp4 = AndroidUtilities.dp(zzkv.m(i3, 1, 16, 10));
                }
                if (z2) {
                    iDp5 = AndroidUtilities.dp(f);
                } else {
                    iDp5 = 0;
                }
                paddingTop = iDp4 + iDp5;
            }
            if (blockRow.quoteLast) {
                i2 = blockRow.quoteBottomEdge;
                if (i2 <= 0) {
                    paddingBottom = 0;
                } else {
                    paddingBottom = AndroidUtilities.dp(zzkv.m(i2, 1, 16, 10));
                }
            }
            if (z2) {
                iDp3 += AndroidUtilities.dp(f2);
                iQuoteInsetEnd += AndroidUtilities.dp(f2);
            }
            if (LocaleController.isRTL) {
                setPadding(getPaddingLeft() + iQuoteInsetEnd, paddingTop, getPaddingRight() + iDp3, paddingBottom);
            } else {
                setPadding(getPaddingLeft() + iDp3, paddingTop, getPaddingRight() + iQuoteInsetEnd, paddingBottom);
            }
        }
        applyListDecoration(blockRow);
        updateLanguageButton(blockRow.block, false);
        if (!String.valueOf(richEditText2.getText()).equals(readPlainText(blockRow.block))) {
            styledText = readStyledText(blockRow.block);
            if (RichEditorListView.isHeading(blockRow.block)) {
                SpannableString spannableString2 = new SpannableString(styledText);
                RichTextStyle.setStyle(spannableString2, 0, spannableString2.length(), 1, false, null);
                RichTextStyle.setStyle(spannableString2, 0, spannableString2.length(), 2, false, null);
                styledText = spannableString2;
            }
            Paint.FontMetricsInt fontMetricsInt2 = richEditText2.getPaint().getFontMetricsInt();
            if (RichEditorListView.isHeading(blockRow.block)) {
                f3 = 0.85f;
            } else {
                f3 = 1.0f;
            }
            richEditText2.setTextSilently(Emoji.replaceEmoji((CharSequence) styledText, fontMetricsInt2, false, f3));
            sizeHeaderEmojiToText(richEditText2.getText());
            richEditText2.invalidateEffects();
            this.highlightedSnapshot = null;
        }
        sizeHeaderEmojiToText(richEditText2.getText());
        updateListNumberStyle();
        pageBlock = blockRow.block;
        zIsQuoteBlock = isQuoteBlock(pageBlock);
        richEditText = this.authorEditText;
        if (zIsQuoteBlock) {
            richEditText.setVisibility(8);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
            richEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
            richEditText.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            richEditText.setTextColorKey(Theme.key_featuredStickers_addButton);
            richEditText.setAccentHint(true);
            richEditText.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                richEditText.setGravity(49);
            } else {
                richEditText.setGravity(8388659);
            }
            if (!String.valueOf(richEditText.getText()).equals(RichTextStyle.plainOf(extractCaption(pageBlock)))) {
                richEditText.setTextSilently(Emoji.replaceEmoji(RichTextStyle.toSpannable(extractCaption(pageBlock), null), richEditText.getPaint().getFontMetricsInt(), false));
                richEditText.invalidateEffects();
            }
            updateAuthorVisibility();
        }
        scheduleHighlight();
    }

    public final int collapseButtonExtraHeight(int i, int i2) {
        Layout layout;
        if (hasCollapseButton()) {
            RichEditText richEditText = this.authorEditText;
            if (richEditText.getVisibility() == 0 && (layout = richEditText.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.collapseButton == null) {
                    this.collapseButton = new QuoteCollapseButton(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.row.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + richEditText.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + richEditText.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + richEditText.getPaddingTop() + measuredHeight;
                int iDp = AndroidUtilities.dp(3.333f);
                float fM = RichMessageLayout$$ExternalSyntheticOutline2.m(i, 16.0f, iDp);
                QuoteCollapseButton quoteCollapseButton = this.collapseButton;
                quoteCollapseButton.getClass();
                float fM2 = fM - RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 3.333f, AndroidUtilities.dp(23.66f) + quoteCollapseButton.textWidth);
                this.collapseButton.getClass();
                int iDp2 = AndroidUtilities.dp(17.66f);
                int i3 = i2 - iDp;
                float f = i3 - iDp2;
                float f2 = i3;
                boolean z = lineRight > fM2;
                boolean z2 = lineBottom > f && lineTop < f2;
                if (z && z2) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + iDp2) + iDp) - i2));
                }
            }
        }
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RichEditText richEditText;
        Canvas canvas2;
        Paint paint;
        float fMax;
        float f;
        float f2;
        int i;
        BlockRow blockRow = this.currentRow;
        LinearLayout linearLayout = this.row;
        Paint paint2 = this.bgPaint;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        RichEditText richEditText2 = this.editText;
        if (blockRow == null || !(blockRow.block instanceof TL_iv.pageBlockPreformatted)) {
            richEditText = richEditText2;
            if (blockRow == null || !(blockRow.block instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (blockRow == null || !(blockRow.block instanceof TL_iv.pageBlockPullquote)) {
                    paint = paint2;
                } else {
                    if (this.quoteLine == null) {
                        ReplyMessageLine replyMessageLine = new ReplyMessageLine(this);
                        this.quoteLine = replyMessageLine;
                        replyMessageLine.check(null, null, null, this.resourcesProvider, 1);
                        ReplyMessageLine replyMessageLine2 = this.quoteLine;
                        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                        int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
                        replyMessageLine2.reversedOut = false;
                        replyMessageLine2.hasColor3 = false;
                        replyMessageLine2.hasColor2 = false;
                        replyMessageLine2.color3 = color;
                        replyMessageLine2.color2 = color;
                        replyMessageLine2.color1 = color;
                        replyMessageLine2.backgroundColor = Theme.multAlpha(zIsDark ? 0.12f : 0.1f, color);
                        replyMessageLine2.emojiColor = color;
                    }
                    if (this.quoteIcon == null) {
                        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.quoteIcon = drawableMutate;
                        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = richEditText.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        fMax = 0.0f;
                        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                            width = Math.min(width, layout.getLineLeft(i2) + richEditText.getPaddingLeft() + richEditText.getLeft() + linearLayout.getLeft());
                            fMax = Math.max(fMax, layout.getLineRight(i2) + richEditText.getPaddingLeft() + richEditText.getLeft() + linearLayout.getLeft());
                        }
                    } else if (richEditText.getHint() != null) {
                        float fMeasureText = richEditText.getPaint().measureText(richEditText.getHint().toString());
                        width = Math.min(width, ((getWidth() - fMeasureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        fMax = Math.max(0.0f, ((getWidth() + fMeasureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        fMax = 0.0f;
                    }
                    RichEditText richEditText3 = this.authorEditText;
                    if (richEditText3.getVisibility() == 0) {
                        Layout layout2 = richEditText3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i3 = 0; i3 < layout2.getLineCount(); i3++) {
                                width = Math.min(width, layout2.getLineLeft(i3) + richEditText3.getPaddingLeft() + richEditText3.getLeft());
                                fMax = Math.max(fMax, layout2.getLineRight(i3) + richEditText3.getPaddingLeft() + richEditText3.getLeft());
                            }
                        } else if (richEditText3.getHint() != null) {
                            float fMeasureText2 = richEditText3.getPaint().measureText(richEditText3.getHint().toString());
                            width = Math.min(width, ((getWidth() - fMeasureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                            fMax = Math.max(fMax, ((getWidth() + fMeasureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        }
                    }
                    if (width < fMax) {
                        float fDp = width - AndroidUtilities.dp(30.0f);
                        float fDp2 = AndroidUtilities.dp(30.0f) + fMax;
                        float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                        int iDp = AndroidUtilities.dp(8.0f);
                        int height = getHeight() - AndroidUtilities.dp(8.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(fDp, iDp, fDp2, height);
                        paint = paint2;
                        this.quoteLine.drawBackground(canvas2, rectF, fFloor, fFloor, fFloor, 1.0f, false, false);
                        canvas2.save();
                        int i4 = (int) fDp;
                        this.quoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i4, AndroidUtilities.dp(7.0f) + iDp, this.quoteIcon.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i4, this.quoteIcon.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + iDp);
                        canvas2.scale(-1.0f, -1.0f, this.quoteIcon.getBounds().centerX(), this.quoteIcon.getBounds().centerY());
                        this.quoteIcon.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i5 = (int) fDp2;
                        this.quoteIcon.setBounds((i5 - AndroidUtilities.dp(8.0f)) - this.quoteIcon.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.quoteIcon.getIntrinsicHeight(), i5 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.quoteIcon.getBounds().centerX(), this.quoteIcon.getBounds().centerY());
                        this.quoteIcon.draw(canvas2);
                        canvas2.restore();
                    } else {
                        paint = paint2;
                    }
                }
            } else {
                if (this.quoteLine == null) {
                    ReplyMessageLine replyMessageLine3 = new ReplyMessageLine(this);
                    this.quoteLine = replyMessageLine3;
                    replyMessageLine3.check(null, null, null, this.resourcesProvider, 1);
                    ReplyMessageLine replyMessageLine4 = this.quoteLine;
                    boolean zIsDark2 = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                    int color2 = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
                    replyMessageLine4.reversedOut = false;
                    replyMessageLine4.hasColor3 = false;
                    replyMessageLine4.hasColor2 = false;
                    replyMessageLine4.color3 = color2;
                    replyMessageLine4.color2 = color2;
                    replyMessageLine4.color1 = color2;
                    replyMessageLine4.backgroundColor = Theme.multAlpha(zIsDark2 ? 0.12f : 0.1f, color2);
                    replyMessageLine4.emojiColor = color2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float fFloor2 = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.quoteLine.drawBackground(canvas2, rectF2, fFloor2, fFloor2, fFloor2, 1.0f, false, false);
                this.quoteLine.drawLine(canvas2, rectF2, 1.0f);
                paint = paint2;
            }
        } else {
            paint2.setColor(Theme.getColor(Theme.key_chat_inArticleCodeBackground, resourcesProvider));
            BlockRow blockRow2 = this.currentRow;
            int size = blockRow2 == null ? 0 : blockRow2.quoteIds.size();
            int iDp2 = size <= 0 ? 0 : AndroidUtilities.dp(zzkv.m(size, 1, 16, 12));
            int iQuoteInsetEnd = RichBlockChrome.quoteInsetEnd(this.currentRow);
            int width2 = getWidth();
            if (iDp2 > 0 || iQuoteInsetEnd > 0) {
                int iDp3 = AndroidUtilities.dp(16.0f) + iDp2;
                int iDp4 = AndroidUtilities.dp(16.0f) + iQuoteInsetEnd;
                i = LocaleController.isRTL ? iDp4 : iDp3;
                int width3 = getWidth();
                if (!LocaleController.isRTL) {
                    iDp3 = iDp4;
                }
                width2 = width3 - iDp3;
            } else {
                i = 0;
            }
            float fDp3 = (i > 0 || width2 < getWidth()) ? AndroidUtilities.dp(8.0f) : 0;
            richEditText = richEditText2;
            canvas.drawRoundRect(i, AndroidUtilities.dp(7.0f), width2, getHeight() - AndroidUtilities.dp(7.0f), fDp3, fDp3, paint2);
            canvas2 = canvas;
            paint = paint2;
        }
        if (this.showCommandBackground) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = richEditText.getLayout();
            if (layout3 != null) {
                float fMax2 = 0.0f;
                float fMax3 = 0.0f;
                for (int i6 = 0; i6 < layout3.getLineCount(); i6++) {
                    height2 = Math.min(height2, layout3.getLineTop(i6) + richEditText.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i6) + richEditText.getPaddingLeft() + richEditText.getLeft() + linearLayout.getLeft());
                    fMax2 = Math.max(fMax2, layout3.getLineRight(i6) + richEditText.getPaddingLeft() + richEditText.getLeft() + linearLayout.getLeft());
                    fMax3 = Math.max(height2, layout3.getLineBottom(i6) + richEditText.getPaddingTop() + getPaddingTop());
                }
                f = fMax3;
                f2 = fMax2;
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (width4 < f2 && height2 < f) {
                float fDp4 = height2 - AndroidUtilities.dp(2.0f);
                float fDp5 = width4 - AndroidUtilities.dp(4.0f);
                float fDp6 = f2 + AndroidUtilities.dp(4.0f);
                float fDp7 = f + AndroidUtilities.dp(2.0f);
                paint.setColor(Theme.multAlpha(0.05f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(fDp5, fDp4, fDp6, fDp7, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = delegate != null ? RichEditorListView.this.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.tmpBlocks;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) arrayList.get(i7);
                canvas2.save();
                canvas2.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
                textSelectionHelper.draw(canvas2, this, i7);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (isBlockquote()) {
            if (this.collapseButton == null) {
                this.collapseButton = new QuoteCollapseButton(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.currentRow.block;
            int color3 = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
            int iDp5 = AndroidUtilities.dp(3.333f);
            this.collapseButton.draw(canvas2, this.collapseButtonBounds, RichMessageLayout$$ExternalSyntheticOutline2.m(getWidth(), 16.0f, iDp5), RichMessageLayout$$ExternalSyntheticOutline2.m(getHeight(), 8.0f, iDp5), color3, pageblockblockquote.collapsed, hasCollapseButton());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (hasCollapseButton() && this.collapseButton != null) {
            boolean zContains = this.collapseButtonBounds.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.collapseButtonPressed) {
                            this.collapseButtonPressed = false;
                            QuoteCollapseButton quoteCollapseButton = this.collapseButton;
                            quoteCollapseButton.pressed = false;
                            quoteCollapseButton.bounce.setPressed(false);
                            return true;
                        }
                    } else if (this.collapseButtonPressed) {
                        QuoteCollapseButton quoteCollapseButton2 = this.collapseButton;
                        quoteCollapseButton2.pressed = zContains;
                        quoteCollapseButton2.bounce.setPressed(zContains);
                        return true;
                    }
                } else if (this.collapseButtonPressed) {
                    this.collapseButtonPressed = false;
                    QuoteCollapseButton quoteCollapseButton3 = this.collapseButton;
                    quoteCollapseButton3.pressed = false;
                    quoteCollapseButton3.bounce.setPressed(false);
                    if (zContains && isBlockquote()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.currentRow.block;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        updateCollapsedDecoration();
                        invalidate();
                        Delegate delegate = this.delegate;
                        if (delegate != null) {
                            RichEditorListView richEditorListView = RichEditorListView.this;
                            RichEditorHistory richEditorHistory = richEditorListView.history;
                            if (richEditorHistory != null) {
                                richEditorHistory.onTyping();
                            }
                            richEditorListView.delegate.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (zContains) {
                this.collapseButtonPressed = true;
                QuoteCollapseButton quoteCollapseButton4 = this.collapseButton;
                quoteCollapseButton4.pressed = true;
                quoteCollapseButton4.bounce.setPressed(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        RichEditText richEditText = this.editText;
        Layout layout2 = richEditText.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.row;
            arrayList.add(new AnonymousClass4(layout2, richEditText.getPaddingLeft() + richEditText.getLeft() + linearLayout.getLeft(), richEditText.getPaddingTop() + richEditText.getTop() + linearLayout.getTop(), 0));
        }
        RichEditText richEditText2 = this.authorEditText;
        if (richEditText2.getVisibility() != 0 || (layout = richEditText2.getLayout()) == null) {
            return;
        }
        arrayList.add(new AnonymousClass4(layout, richEditText2.getPaddingLeft() + richEditText2.getLeft(), richEditText2.getPaddingTop() + richEditText2.getTop(), 2));
    }

    public RichEditText getAuthorEditText() {
        return this.authorEditText;
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

    public FloatingToolbar.StyleDelegate getStyleDelegate() {
        return this.editText;
    }

    public final boolean hasCollapseButton() {
        Layout layout;
        return isBlockquote() && (layout = this.editText.getLayout()) != null && layout.getLineCount() > 3;
    }

    public final boolean isAuthorVisible() {
        return this.authorEditText.getVisibility() == 0;
    }

    public final boolean isBlockquote() {
        BlockRow blockRow = this.currentRow;
        return blockRow != null && (blockRow.block instanceof TL_iv.pageBlockBlockquote);
    }

    public final void lambda$new$2$1(boolean z) {
        Delegate delegate;
        this.editText.setHint(getHint());
        if (z || (delegate = this.delegate) == null) {
            return;
        }
        RichEditorListView.this.delegate.onSlashSuggest(this, null);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        updateCollapsedDecoration();
        RichEditText richEditText = this.authorEditText;
        if (richEditText.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.row;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        richEditText.layout(paddingLeft, measuredHeight, richEditText.getMeasuredWidth() + paddingLeft, richEditText.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        syncLiveListVerticalPadding();
        int size = View.MeasureSpec.getSize(i);
        RichEditText richEditText = this.authorEditText;
        if (richEditText.getVisibility() == 8) {
            this.collapseExtraHeight = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            return;
        }
        int iMax = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        LinearLayout linearLayout = this.row;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        richEditText.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + richEditText.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int iCollapseButtonExtraHeight = collapseButtonExtraHeight(size, paddingBottom);
        this.collapseExtraHeight = iCollapseButtonExtraHeight;
        setMeasuredDimension(size, paddingBottom + iCollapseButtonExtraHeight);
    }

    public final void persistAuthor() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || !isQuoteBlock(blockRow.block)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.currentRow.block;
        TL_iv.RichText richTextFromSpannable = RichTextStyle.fromSpannable(this.authorEditText.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = richTextFromSpannable;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = richTextFromSpannable;
        }
    }

    public final void persistStyle() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            blockRow.block.text = RichTextStyle.fromSpannable(this.editText.getText());
        }
    }

    public final void scheduleHighlight() {
        Runnable runnable = this.highlightScheduled;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.highlightScheduled = null;
        }
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                RichTextCell$$ExternalSyntheticLambda7 richTextCell$$ExternalSyntheticLambda7 = new RichTextCell$$ExternalSyntheticLambda7(this, 0);
                this.highlightScheduled = richTextCell$$ExternalSyntheticLambda7;
                postDelayed(richTextCell$$ExternalSyntheticLambda7, 100L);
                return;
            }
        }
        this.highlightGeneration++;
        Editable text = this.editText.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.highlightedSnapshot = null;
    }

    public final void selectCommand(RichCommand richCommand) {
        if (this.delegate == null || this.currentRow == null || richCommand == null) {
            return;
        }
        List<String> list = richCommand.commands;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int iMatchCommand = matchCommand(str);
            if (iMatchCommand != 0) {
                ((RichEditorListView.AnonymousClass14) this.delegate).onCommand(this.currentRow, iMatchCommand);
                return;
            }
            Transform transformMatchEnterTrigger = matchEnterTrigger(this.currentRow, str);
            if (transformMatchEnterTrigger == null) {
                transformMatchEnterTrigger = matchMarkdownTrigger(this.currentRow, zzhr.m(str, " "));
            }
            if (transformMatchEnterTrigger != null) {
                Delegate delegate = this.delegate;
                BlockRow blockRow = this.currentRow;
                RichEditorListView.AnonymousClass14 anonymousClass14 = (RichEditorListView.AnonymousClass14) delegate;
                anonymousClass14.getClass();
                TL_iv.PageBlock pageBlock = transformMatchEnterTrigger.block;
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    RichEditorListView.this.applyQuote(blockRow);
                    return;
                }
                RichEditorListView.this.transformRow(blockRow, pageBlock, transformMatchEnterTrigger.level, transformMatchEnterTrigger.num, transformMatchEnterTrigger.checkbox, transformMatchEnterTrigger.checked);
                return;
            }
        }
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
        this.authorEditText.setLocked(z);
    }

    public void setShowCommandBackground(boolean z) {
        if (this.showCommandBackground == z) {
            return;
        }
        this.showCommandBackground = z;
        invalidate();
    }

    public final void sizeHeaderEmojiToText(Editable editable) {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || !RichEditorListView.isHeading(blockRow.block) || editable == null) {
            return;
        }
        RichEditText richEditText = this.editText;
        Paint.FontMetricsInt fontMetricsInt = richEditText.getPaint().getFontMetricsInt();
        int iMax = Math.max(1, Math.round((richEditText.getTextSize() * 0.85f) / 1.2f));
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
            emojiSpan.scale = 0.85f;
        }
        for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) editable.getSpans(0, editable.length(), AnimatedEmojiSpan.class)) {
            animatedEmojiSpan.replaceFontMetrics(fontMetricsInt);
            animatedEmojiSpan.setSize(iMax);
        }
    }

    public final void syncLiveListVerticalPadding() {
        Delegate delegate;
        float f;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || blockRow.level <= 0 || (delegate = this.delegate) == null) {
            return;
        }
        RichEditorListView richEditorListView = RichEditorListView.this;
        int iIndexOf = richEditorListView.rows.indexOf(blockRow);
        int iDp = AndroidUtilities.dp((iIndexOf <= 0 || ((BlockRow) richEditorListView.rows.get(iIndexOf - 1)).level <= 0) ? 8.0f : 2.0f);
        RichEditorListView.AnonymousClass14 anonymousClass14 = (RichEditorListView.AnonymousClass14) this.delegate;
        int iIndexOf2 = RichEditorListView.this.rows.indexOf(this.currentRow);
        if (iIndexOf2 >= 0) {
            int i = iIndexOf2 + 1;
            RichEditorListView richEditorListView2 = RichEditorListView.this;
            if (i >= richEditorListView2.rows.size() || ((BlockRow) richEditorListView2.rows.get(i)).level <= 0) {
                f = 11.0f;
            } else {
                f = 5.0f;
            }
        } else {
            f = 11.0f;
        }
        int iDp2 = AndroidUtilities.dp(f);
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2.quoteFirst) {
            int i2 = blockRow2.quoteTopEdge;
            iDp = i2 <= 0 ? 0 : AndroidUtilities.dp(zzkv.m(i2, 1, 16, 10));
        }
        BlockRow blockRow3 = this.currentRow;
        if (blockRow3.quoteLast) {
            int i3 = blockRow3.quoteBottomEdge;
            iDp2 = i3 <= 0 ? 0 : AndroidUtilities.dp(zzkv.m(i3, 1, 16, 10));
        }
        if (iDp == getPaddingTop() && iDp2 == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), iDp, getPaddingRight(), iDp2);
    }

    public final void updateAuthorVisibility() {
        BlockRow blockRow = this.currentRow;
        RichEditText richEditText = this.editText;
        RichEditText richEditText2 = this.authorEditText;
        if (blockRow != null && isQuoteBlock(blockRow.block) && (richEditText.length() > 0 || richEditText2.length() > 0)) {
            if (richEditText2.getVisibility() != 0) {
                richEditText2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (richEditText2.getVisibility() != 8) {
            if (richEditText2.isFocused()) {
                richEditText.requestFocus();
            }
            richEditText2.setVisibility(8);
            requestLayout();
        }
    }

    public final void updateCollapsedDecoration() {
        int length;
        Layout layout;
        int lineStart;
        RichEditText richEditText = this.editText;
        if (richEditText.getText() != null) {
            Editable text = richEditText.getText();
            int i = -1;
            if (!isBlockquote() || !((TL_iv.pageBlockBlockquote) this.currentRow.block).collapsed || (layout = richEditText.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (length = text.length())) {
                length = -1;
            } else {
                i = lineStart;
            }
            if (i == this.collapsedPartStart && length == this.collapsedPartEnd) {
                return;
            }
            this.applyingCollapsedDecoration = true;
            try {
                CollapsedTextPart collapsedTextPart = this.collapsedPart;
                if (collapsedTextPart != null) {
                    text.removeSpan(collapsedTextPart);
                }
                if (i >= 0) {
                    if (this.collapsedPart == null) {
                        this.collapsedPart = new CollapsedTextPart(this, 0);
                    }
                    text.setSpan(this.collapsedPart, i, length, 33);
                }
                this.applyingCollapsedDecoration = false;
                this.collapsedPartStart = i;
                this.collapsedPartEnd = length;
            } catch (Throwable th) {
                this.applyingCollapsedDecoration = false;
                throw th;
            }
        }
    }

    @Override
    public final void updateColors$1() {
        this.editText.updateColors();
        RichEditText richEditText = this.authorEditText;
        if (richEditText != null) {
            richEditText.updateColors();
        }
        int i = Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.bullet.setTextColor(Theme.getColor(i, resourcesProvider));
        Drawable drawable = this.quoteIcon;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
        ReplyMessageLine replyMessageLine = this.quoteLine;
        if (replyMessageLine != null) {
            boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
            replyMessageLine.reversedOut = false;
            replyMessageLine.hasColor3 = false;
            replyMessageLine.hasColor2 = false;
            replyMessageLine.color3 = color;
            replyMessageLine.color2 = color;
            replyMessageLine.color1 = color;
            replyMessageLine.backgroundColor = Theme.multAlpha(zIsDark ? 0.12f : 0.1f, color);
            replyMessageLine.emojiColor = color;
        }
    }

    public final void updateLanguageButton(TL_iv.PageBlock pageBlock, boolean z) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.languageButton;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.languageButton;
        if (linearLayout2 != null && z) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.languageButton = null;
        }
        LinearLayout linearLayout3 = this.languageButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.languageButton = linearLayout4;
            linearLayout4.setOrientation(0);
            this.languageButton.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.languageButton.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.languageButton, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.languageButtonText = textView;
            textView.setTextSize(1, 12.0f);
            this.languageButtonText.setGravity(17);
            this.languageButton.addView(this.languageButtonText, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.languageButtonIcon = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.languageButton.addView(this.languageButtonIcon, LayoutHelper.createLinear(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.languageButton.setOnClickListener(new RichTextCell$$ExternalSyntheticLambda1(this, 1));
            this.languageButton.setOnLongClickListener(new RichTextCell$$ExternalSyntheticLambda6());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int iMultAlpha = Theme.multAlpha(TextUtils.isEmpty(str) ? 0.5f : 0.75f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.languageButtonIcon.setColorFilter(new PorterDuffColorFilter(iMultAlpha, PorterDuff.Mode.SRC_IN));
        this.languageButtonText.setTextColor(iMultAlpha);
        if (TextUtils.isEmpty(str)) {
            this.languageButtonText.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.languageButtonText.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.languageButton.setVisibility(0);
    }

    public final void updateListNumberStyle() {
        BlockRow blockRow = this.currentRow;
        boolean z = false;
        if (blockRow != null && blockRow.num > 0) {
            RichEditText richEditText = this.editText;
            if (richEditText.length() > 0 && (richEditText.getCurrentStyle(0, 1) & 1) != 0) {
                z = true;
            }
        }
        this.bullet.setTypeface(z ? AndroidUtilities.bold() : null);
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 == null || blockRow2.num <= 0) {
            return;
        }
        applyListDecoration(blockRow2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        QuoteCollapseButton quoteCollapseButton = this.collapseButton;
        if (quoteCollapseButton != null) {
            return drawable == quoteCollapseButton.text || drawable == quoteCollapseButton.drawable;
        }
        return false;
    }
}
