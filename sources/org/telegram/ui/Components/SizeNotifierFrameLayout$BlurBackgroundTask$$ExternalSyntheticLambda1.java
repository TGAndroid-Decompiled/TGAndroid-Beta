package org.telegram.ui.Components;

public final class SizeNotifierFrameLayout$BlurBackgroundTask$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SizeNotifierFrameLayout.BlurBackgroundTask f$0;

    public SizeNotifierFrameLayout$BlurBackgroundTask$$ExternalSyntheticLambda1(SizeNotifierFrameLayout.BlurBackgroundTask blurBackgroundTask, int i) {
        this.$r8$classId = i;
        this.f$0 = blurBackgroundTask;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$run$1();
                break;
            default:
                this.f$0.lambda$run$2();
                break;
        }
    }
}
