package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class ChatActivity$$ExternalSyntheticLambda177 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda177(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadLastUnreadMention$472(i);
                break;
            case 1:
                this.f$0.lambda$createTopPanel$87(i);
                break;
            default:
                this.f$0.lambda$processSelectedOption$322(i);
                break;
        }
    }
}
