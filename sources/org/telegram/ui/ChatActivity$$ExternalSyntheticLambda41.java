package org.telegram.ui;

import android.view.View;

public final class ChatActivity$$ExternalSyntheticLambda41 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final View f$1;

    public ChatActivity$$ExternalSyntheticLambda41(int i, View view, ChatActivity chatActivity) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = view;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateMessagesVisiblePart$155(this.f$1);
                break;
            case 1:
                this.f$0.lambda$createView$64(this.f$1);
                break;
            default:
                this.f$0.lambda$createView$67(this.f$1);
                break;
        }
    }
}
