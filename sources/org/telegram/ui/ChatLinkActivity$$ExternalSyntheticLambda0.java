package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatLinkActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity f$0;

    public ChatLinkActivity$$ExternalSyntheticLambda0(ChatLinkActivity chatLinkActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatLinkActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatLinkActivity chatLinkActivity = this.f$0;
                AlertDialog alertDialog = chatLinkActivity.waitingForFullChatProgressAlert;
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(chatLinkActivity, 3));
                    chatLinkActivity.showDialog(chatLinkActivity.waitingForFullChatProgressAlert);
                    break;
                }
                break;
            case 1:
                ChatLinkActivity chatLinkActivity2 = this.f$0;
                chatLinkActivity2.getMessagesController().loadFullChat(chatLinkActivity2.currentChatId, 0, true);
                break;
            default:
                ChatLinkActivity chatLinkActivity3 = this.f$0;
                chatLinkActivity3.getMessagesController().loadFullChat(chatLinkActivity3.currentChatId, 0, true);
                break;
        }
    }
}
