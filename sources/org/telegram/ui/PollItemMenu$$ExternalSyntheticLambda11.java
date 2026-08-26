package org.telegram.ui;

public final class PollItemMenu$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final PollItemMenu f$0;

    public PollItemMenu$$ExternalSyntheticLambda11(PollItemMenu pollItemMenu, int i) {
        this.$r8$classId = i;
        this.f$0 = pollItemMenu;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismiss$15();
                break;
            case 1:
                this.f$0.lambda$setupMessageOptions$10();
                break;
            default:
                this.f$0.lambda$setupMessageOptions$11();
                break;
        }
    }
}
