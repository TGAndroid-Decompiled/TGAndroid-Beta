package org.telegram.ui;

public final class TopicsFragment$7$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final TopicsFragment.AnonymousClass7 f$0;

    public TopicsFragment$7$$ExternalSyntheticLambda0(TopicsFragment.AnonymousClass7 anonymousClass7, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass7;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onAllAnimationsDone$0();
                break;
            default:
                this.f$0.lambda$endAnimations$1();
                break;
        }
    }
}
