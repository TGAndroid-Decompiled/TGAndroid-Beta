package org.telegram.ui.iv;

import android.text.Editable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.iv.RichEditorListView.InlineButtonEdit;

public final class RichEditorListView$$ExternalSyntheticLambda37 implements RichTableCell.CellSelectionListener, RichEditText.InlineButtonClickListener {
    public final RichEditorListView f$0;

    public RichEditorListView$$ExternalSyntheticLambda37(RichEditorListView richEditorListView) {
        this.f$0 = richEditorListView;
    }

    public void onInlineButtonClick(RichEditText richEditText, RichInlineButtonSpan richInlineButtonSpan, boolean z) {
        char c;
        RichEditText richEditText2;
        RichEditorListView richEditorListView = this.f$0;
        richEditorListView.getClass();
        Editable text = richEditText.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(richInlineButtonSpan);
        int spanEnd = text == null ? -1 : text.getSpanEnd(richInlineButtonSpan);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        RichEditorListView.Delegate delegate = richEditorListView.delegate;
        if (z) {
            richEditorListView.hideTextSelectionUi(false);
            delegate.onInlineButtonEditRequested(richEditorListView.new InlineButtonEdit(richEditText, spanStart, spanEnd, richInlineButtonSpan), richEditText);
            return;
        }
        TL_iv.textButton textbutton = richInlineButtonSpan.button;
        if (textbutton == null) {
            return;
        }
        RichEditorHistory richEditorHistory = richEditorListView.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
        if (richButtonStyle != null && richButtonStyle.bg_primary) {
            c = 2;
        } else if (richButtonStyle == null || !richButtonStyle.bg_danger) {
            c = (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0;
        } else {
            c = 3;
        }
        if (richButtonStyle == null) {
            richButtonStyle = new TL_keyboard.RichButtonStyle();
        }
        richButtonStyle.flags = 0;
        richButtonStyle.bg_primary = c == 1;
        richButtonStyle.bg_danger = c == 2;
        richButtonStyle.bg_success = c == 3;
        richButtonStyle.link = false;
        textbutton.style = richButtonStyle;
        Editable text2 = richEditText.getText();
        if (text2 == null || text2.getSpanStart(richInlineButtonSpan) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = richInlineButtonSpan.renderedSpan;
        if (richButtonSpan != null && richInlineButtonSpan.attachedView == richEditText) {
            richButtonSpan.detach(richEditText);
            richInlineButtonSpan.attachedView = null;
        }
        text2.removeSpan(richInlineButtonSpan);
        RichInlineButtonSpan richInlineButtonSpan2 = new RichInlineButtonSpan(textbutton);
        RichMessageLayout.RichButtonSpan richButtonSpan2 = richInlineButtonSpan2.renderedSpan;
        if (richButtonSpan2 != null && (richEditText2 = richInlineButtonSpan2.attachedView) != null) {
            richButtonSpan2.detach(richEditText2);
        }
        richInlineButtonSpan2.attachedView = richEditText;
        richInlineButtonSpan2.currentAccount = richEditorListView.currentAccount;
        richInlineButtonSpan2.resourcesProvider = richEditorListView.resourcesProvider;
        richInlineButtonSpan2.renderedSpan = null;
        richInlineButtonSpan2.ensureRenderer();
        text2.setSpan(richInlineButtonSpan2, spanStart, spanEnd, 33);
        richEditText.notifyInlineContentChanged();
        delegate.onContentChanged();
    }
}
