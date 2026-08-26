package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ChatMessageCellDelegate f$0;
    public final TLRPC.Chat f$1;

    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda16(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, TLRPC.Chat chat, int i) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCellDelegate;
        this.f$1 = chat;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didPressChannelRecommendation$41(this.f$1);
                break;
            case 1:
                this.f$0.lambda$didLongPressChannelAvatar$16(this.f$1);
                break;
            case 2:
                this.f$0.lambda$didLongPressChannelAvatar$18(this.f$1);
                break;
            default:
                this.f$0.lambda$didLongPressChannelAvatar$19(this.f$1);
                break;
        }
    }
}
