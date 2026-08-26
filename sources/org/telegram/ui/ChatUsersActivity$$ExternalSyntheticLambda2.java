package org.telegram.ui;

public final class ChatUsersActivity$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatUsersActivity f$0;

    public ChatUsersActivity$$ExternalSyntheticLambda2(ChatUsersActivity chatUsersActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatUsersActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$25();
                break;
            default:
                this.f$0.lambda$deletePeer$21();
                break;
        }
    }
}
