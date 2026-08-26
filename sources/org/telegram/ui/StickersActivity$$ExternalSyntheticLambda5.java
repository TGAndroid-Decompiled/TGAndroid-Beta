package org.telegram.ui;

public final class StickersActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final StickersActivity f$0;

    public StickersActivity$$ExternalSyntheticLambda5(StickersActivity stickersActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.sendReorder();
                break;
            default:
                this.f$0.activeReorderingRequests--;
                break;
        }
    }
}
