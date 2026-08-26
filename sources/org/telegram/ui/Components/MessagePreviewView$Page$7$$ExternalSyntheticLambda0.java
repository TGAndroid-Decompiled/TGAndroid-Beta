package org.telegram.ui.Components;

public final class MessagePreviewView$Page$7$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final MessagePreviewView.Page.AnonymousClass7 f$0;

    public MessagePreviewView$Page$7$$ExternalSyntheticLambda0(MessagePreviewView.Page.AnonymousClass7 anonymousClass7, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass7;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onAllAnimationsDone$0();
                break;
            case 1:
                this.f$0.lambda$onAllAnimationsDone$1();
                break;
            default:
                this.f$0.lambda$endAnimations$2();
                break;
        }
    }
}
