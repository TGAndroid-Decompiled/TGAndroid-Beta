package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda333 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final TLRPC.User f$1;

    public ChatActivity$$ExternalSyntheticLambda333(ChatActivity chatActivity, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                chatActivity.presentFragment(ChatActivity.of(this.f$1.id));
                break;
            default:
                this.f$0.openSearchWithUser(this.f$1);
                break;
        }
    }
}
