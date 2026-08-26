package org.telegram.ui;

import org.telegram.messenger.MessageObject;

public final class ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ChatMessageCellDelegate f$0;
    public final MessageObject f$1;

    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCellDelegate;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didPressImage$46(this.f$1);
                break;
            case 1:
                this.f$0.lambda$didPressImage$45(this.f$1);
                break;
            default:
                this.f$0.lambda$didPressReplyMessage$43(this.f$1);
                break;
        }
    }
}
