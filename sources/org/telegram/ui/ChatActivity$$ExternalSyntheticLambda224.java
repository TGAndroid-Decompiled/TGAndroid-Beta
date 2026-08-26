package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda224 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final TLRPC.User f$1;

    public ChatActivity$$ExternalSyntheticLambda224(ChatActivity chatActivity, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openSearchWithUser$369(this.f$1);
                break;
            default:
                this.f$0.lambda$didPressPhoneNumber$449(this.f$1);
                break;
        }
    }
}
