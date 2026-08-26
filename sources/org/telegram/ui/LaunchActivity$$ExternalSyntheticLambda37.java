package org.telegram.ui;

public final class LaunchActivity$$ExternalSyntheticLambda37 implements Runnable {
    public final int $r8$classId;
    public final Runnable f$0;

    public LaunchActivity$$ExternalSyntheticLambda37(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity.lambda$runLinkRequest$55(this.f$0);
                break;
            case 1:
                LaunchActivity.lambda$runLinkRequest$80(this.f$0);
                break;
            default:
                this.f$0.run();
                break;
        }
    }
}
