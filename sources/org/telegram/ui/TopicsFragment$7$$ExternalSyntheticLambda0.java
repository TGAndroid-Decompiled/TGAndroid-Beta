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
                TopicsFragment.AnonymousClass7 anonymousClass7 = this.f$0;
                anonymousClass7.finishRunnable = null;
                if (anonymousClass7.scrollAnimationIndex != -1) {
                    TopicsFragment.this.getNotificationCenter().onAnimationFinish(anonymousClass7.scrollAnimationIndex);
                    anonymousClass7.scrollAnimationIndex = -1;
                }
                break;
            default:
                TopicsFragment.AnonymousClass7 anonymousClass8 = this.f$0;
                anonymousClass8.finishRunnable = null;
                if (anonymousClass8.scrollAnimationIndex != -1) {
                    TopicsFragment.this.getNotificationCenter().onAnimationFinish(anonymousClass8.scrollAnimationIndex);
                    anonymousClass8.scrollAnimationIndex = -1;
                }
                break;
        }
    }
}
