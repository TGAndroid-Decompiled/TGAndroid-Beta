package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda403 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final int f$1;
    public final TLObject f$2;
    public final TLRPC.TL_error f$3;
    public final int f$4;
    public final MessageObject f$5;
    public final TLRPC.TL_messages_getDiscussionMessage f$6;
    public final TLRPC.Chat f$7;
    public final int f$8;
    public final MessageObject f$9;

    public ChatActivity$$ExternalSyntheticLambda403(ChatActivity chatActivity, int i, TLObject tLObject, TLRPC.TL_error tL_error, int i2, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i3, MessageObject messageObject2, int i4) {
        this.$r8$classId = i4;
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = tLObject;
        this.f$3 = tL_error;
        this.f$4 = i2;
        this.f$5 = messageObject;
        this.f$6 = tL_messages_getDiscussionMessage;
        this.f$7 = chat;
        this.f$8 = i3;
        this.f$9 = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openDiscussionMessageChat$379(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            default:
                this.f$0.lambda$openDiscussionMessageChat$378(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
        }
    }
}
