package org.telegram.ui;

public final class ChatActivity$$ExternalSyntheticLambda166 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final long f$1;
    public final long f$2;

    public ChatActivity$$ExternalSyntheticLambda166(ChatActivity chatActivity, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processNewMessages$202(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$updateTopPanel$242(this.f$1, this.f$2);
                break;
        }
    }
}
