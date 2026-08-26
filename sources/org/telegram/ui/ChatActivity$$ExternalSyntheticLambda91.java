package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$$ExternalSyntheticLambda91 implements Runnable {
    public final int $r8$classId = 1;
    public final ChatActivity f$0;
    public final MessageObject f$1;
    public final int f$2;

    public ChatActivity$$ExternalSyntheticLambda91(ChatActivity chatActivity, int i, MessageObject messageObject) {
        this.f$0 = chatActivity;
        this.f$2 = i;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.delayedReadRunnable = null;
                this.f$1.messageOwner.replies.read_max_id = this.f$2;
                break;
            default:
                ChatActivity chatActivity = this.f$0;
                BulletinFactory.of(chatActivity).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                MessagesController.getInstance(this.f$2).disableAds(false);
                MessageObject messageObject = this.f$1;
                chatActivity.removeFromSponsored(messageObject);
                chatActivity.removeMessageWithThanos(messageObject);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda91(ChatActivity chatActivity, MessageObject messageObject, int i) {
        this.f$0 = chatActivity;
        this.f$1 = messageObject;
        this.f$2 = i;
    }
}
