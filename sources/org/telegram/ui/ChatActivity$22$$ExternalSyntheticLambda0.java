package org.telegram.ui;

public final class ChatActivity$22$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.AnonymousClass22 f$0;

    public ChatActivity$22$$ExternalSyntheticLambda0(ChatActivity.AnonymousClass22 anonymousClass22, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass22;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$endAnimations$1();
                break;
            default:
                this.f$0.lambda$onAllAnimationsDone$0();
                break;
        }
    }
}
