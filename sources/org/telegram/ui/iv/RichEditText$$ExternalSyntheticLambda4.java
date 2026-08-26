package org.telegram.ui.iv;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.ChatbotsActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.Stars.BotStarsActivity;

public final class RichEditText$$ExternalSyntheticLambda4 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final Object f$0;

    public RichEditText$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                RichEditText richEditText = (RichEditText) this.f$0;
                if (i != 5) {
                    richEditText.getClass();
                    return false;
                }
                RichEditText.Listener listener = richEditText.listener;
                if (listener == null || richEditText.allowNewlines) {
                    return false;
                }
                if (richEditText.softEnterNewline) {
                    int iMax = Math.max(0, richEditText.getSelectionStart());
                    int iMax2 = Math.max(0, richEditText.getSelectionEnd());
                    if (iMax > iMax2) {
                        iMax2 = iMax;
                        iMax = iMax2;
                    }
                    richEditText.insertingNewline = true;
                    richEditText.getText().replace(iMax, iMax2, "\n");
                    richEditText.insertingNewline = false;
                    richEditText.setSelection(iMax + 1);
                } else {
                    listener.onEnterPressed(richEditText);
                }
                return true;
            case 1:
                ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.f$0;
                boolean z = false;
                if (i == 6) {
                    chatbotsActivity.scheduledLoading = false;
                    ChatbotsActivity$$ExternalSyntheticLambda5 chatbotsActivity$$ExternalSyntheticLambda5 = chatbotsActivity.search;
                    AndroidUtilities.cancelRunOnUIThread(chatbotsActivity$$ExternalSyntheticLambda5);
                    z = true;
                    if (TextUtils.isEmpty(chatbotsActivity.editText.getText())) {
                        chatbotsActivity.lastQuery = null;
                        chatbotsActivity.searchHelper.clear();
                        chatbotsActivity.listView.adapter.update(true);
                    } else {
                        AndroidUtilities.runOnUIThread(chatbotsActivity$$ExternalSyntheticLambda5);
                    }
                    chatbotsActivity.updateSearchLoading();
                }
                return z;
            default:
                BotStarsActivity botStarsActivity = (BotStarsActivity) this.f$0;
                if (i == 5) {
                    botStarsActivity.withdraw();
                    return true;
                }
                botStarsActivity.getClass();
                return false;
        }
    }
}
