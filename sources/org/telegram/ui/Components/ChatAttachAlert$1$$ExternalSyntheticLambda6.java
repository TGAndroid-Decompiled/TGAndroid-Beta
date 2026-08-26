package org.telegram.ui.Components;

public final class ChatAttachAlert$1$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Runnable f$0;

    public ChatAttachAlert$1$$ExternalSyntheticLambda6(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlert.AnonymousClass1.lambda$onCloseRequested$0(this.f$0);
                break;
            default:
                SharedMediaLayout.MoreRecommendationsCell.lambda$new$1(this.f$0);
                break;
        }
    }
}
