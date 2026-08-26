package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda494 implements Runnable {
    public final int $r8$classId = 0;
    public final ChatActivity f$0;
    public final TLRPC.TL_attachMenuBot f$1;
    public final TLRPC.TL_error f$2;
    public final TLRPC.User f$3;

    public ChatActivity$$ExternalSyntheticLambda494(ChatActivity chatActivity, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.f$0 = chatActivity;
        this.f$1 = tL_attachMenuBot;
        this.f$2 = tL_error;
        this.f$3 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.User user = this.f$3;
                this.f$0.lambda$openAttachBotLayout$209(this.f$1, this.f$2, user);
                break;
            default:
                this.f$0.lambda$openAttachBotLayout$212(this.f$1, this.f$2, this.f$3);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda494(ChatActivity chatActivity, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.f$0 = chatActivity;
        this.f$2 = tL_error;
        this.f$1 = tL_attachMenuBot;
        this.f$3 = user;
    }
}
