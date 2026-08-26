package org.telegram.ui;

import org.telegram.messenger.MessageObject;

public final class ChatActivity$$ExternalSyntheticLambda405 implements Runnable {
    public final int $r8$classId = 1;
    public final ChatActivity f$0;
    public final MessageObject f$1;
    public final int f$2;

    public ChatActivity$$ExternalSyntheticLambda405(ChatActivity chatActivity, int i, MessageObject messageObject) {
        this.f$0 = chatActivity;
        this.f$2 = i;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification2$173(this.f$1, this.f$2);
                break;
            default:
                ReportBottomSheet.lambda$openSponsored$12(this.f$0, this.f$2, this.f$1);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda405(ChatActivity chatActivity, MessageObject messageObject, int i) {
        this.f$0 = chatActivity;
        this.f$1 = messageObject;
        this.f$2 = i;
    }
}
