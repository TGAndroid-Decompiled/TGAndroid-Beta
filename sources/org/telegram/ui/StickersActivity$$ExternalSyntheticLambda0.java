package org.telegram.ui;

public final class StickersActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StickersActivity f$0;

    public StickersActivity$$ExternalSyntheticLambda0(StickersActivity stickersActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendReorder$6();
                break;
            default:
                this.f$0.lambda$new$5();
                break;
        }
    }
}
