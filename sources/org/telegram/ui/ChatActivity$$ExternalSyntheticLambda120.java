package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatActivity$$ExternalSyntheticLambda120 implements Runnable {
    public final int $r8$classId = 0;
    public final ChatActivity f$0;
    public final CharSequence f$1;
    public final MessagesController f$2;
    public final boolean f$3;

    public ChatActivity$$ExternalSyntheticLambda120(ChatActivity chatActivity, CharSequence charSequence, MessagesController messagesController, boolean z) {
        this.f$0 = chatActivity;
        this.f$1 = charSequence;
        this.f$2 = messagesController;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchLinks$138(this.f$1, this.f$2, this.f$3);
                break;
            default:
                ChatActivity chatActivity = this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity(), 0, chatActivity.themeDelegate);
                String string = LocaleController.getString(R.string.AppName);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                String string2 = LocaleController.getString(R.string.OK);
                CharSequence charSequence = this.f$1;
                boolean z = this.f$3;
                MessagesController messagesController = this.f$2;
                builder.setPositiveButton(string2, new ChatActivity$$ExternalSyntheticLambda454(chatActivity, messagesController, charSequence, z, 0));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                alertDialog.message = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                chatActivity.showDialog(alertDialog);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda120(ChatActivity chatActivity, MessagesController messagesController, CharSequence charSequence, boolean z) {
        this.f$0 = chatActivity;
        this.f$2 = messagesController;
        this.f$1 = charSequence;
        this.f$3 = z;
    }
}
