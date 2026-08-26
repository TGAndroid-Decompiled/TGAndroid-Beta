package org.telegram.ui;

import org.telegram.messenger.MessagesController;

public final class ChatActivity$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId = 0;
    public final ChatActivity f$0;
    public final CharSequence f$1;
    public final MessagesController f$2;
    public final boolean f$3;

    public ChatActivity$$ExternalSyntheticLambda16(ChatActivity chatActivity, CharSequence charSequence, MessagesController messagesController, boolean z) {
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
                this.f$0.lambda$searchLinks$135(this.f$2, this.f$1, this.f$3);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda16(ChatActivity chatActivity, MessagesController messagesController, CharSequence charSequence, boolean z) {
        this.f$0 = chatActivity;
        this.f$2 = messagesController;
        this.f$1 = charSequence;
        this.f$3 = z;
    }
}
