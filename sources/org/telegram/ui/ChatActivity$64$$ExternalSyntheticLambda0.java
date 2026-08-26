package org.telegram.ui;

public final class ChatActivity$64$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.AnonymousClass64 f$0;

    public ChatActivity$64$$ExternalSyntheticLambda0(ChatActivity.AnonymousClass64 anonymousClass64, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass64;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onFullDismiss$0();
                break;
            default:
                this.f$0.lambda$onDismiss$1();
                break;
        }
    }
}
