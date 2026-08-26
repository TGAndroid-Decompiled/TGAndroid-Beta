package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda337;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda37;

public final class SharedMediaLayout$$ExternalSyntheticLambda35 implements Runnable {
    public final int $r8$classId = 0;
    public final SharedMediaLayout f$0;
    public final Theme.ResourcesProvider f$1;
    public final int f$2;
    public final MessageObject f$3;

    public SharedMediaLayout$$ExternalSyntheticLambda35(SharedMediaLayout sharedMediaLayout, Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject) {
        this.f$0 = sharedMediaLayout;
        this.f$1 = resourcesProvider;
        this.f$2 = i;
        this.f$3 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog[] alertDialogArr = {new AlertDialog(this.f$0.getContext(), 3, this.f$1)};
                int i = this.f$2;
                int iSendVote = SendMessagesHelper.getInstance(i).sendVote(this.f$3, null, new ChatActivity$$ExternalSyntheticLambda337(alertDialogArr, 7));
                if (iSendVote != 0) {
                    AndroidUtilities.runOnUIThread(new SharedMediaLayout$$ExternalSyntheticLambda50(alertDialogArr, i, iSendVote, 0), 500L);
                }
                break;
            default:
                SharedMediaLayout sharedMediaLayout = this.f$0;
                Context context = sharedMediaLayout.getContext();
                Theme.ResourcesProvider resourcesProvider = this.f$1;
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.dimEnabled = false;
                MessageObject messageObject = this.f$3;
                if (messageObject.isQuiz()) {
                    alertDialog.title = LocaleController.getString(R.string.StopQuizAlertTitle);
                    alertDialog.message = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    alertDialog.title = LocaleController.getString(R.string.StopPollAlertTitle);
                    alertDialog.message = LocaleController.getString(R.string.StopPollAlertText);
                }
                builder.setPositiveButton(LocaleController.getString(R.string.Stop), new VoIPFragment$$ExternalSyntheticLambda37(sharedMediaLayout, resourcesProvider, messageObject, this.f$2, 7));
                ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
                break;
        }
    }

    public SharedMediaLayout$$ExternalSyntheticLambda35(SharedMediaLayout sharedMediaLayout, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, int i) {
        this.f$0 = sharedMediaLayout;
        this.f$1 = resourcesProvider;
        this.f$3 = messageObject;
        this.f$2 = i;
    }
}
