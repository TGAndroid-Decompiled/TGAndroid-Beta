package org.telegram.ui.Components;

public final class RLottieDrawable$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final RLottieDrawable f$0;

    public RLottieDrawable$$ExternalSyntheticLambda1(RLottieDrawable rLottieDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = rLottieDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.uiRunnableNoFrameImpl();
                break;
            case 1:
                this.f$0.uiRunnableImpl();
                break;
            case 2:
                this.f$0.uiRunnableGenerateCacheImpl();
                break;
            case 3:
                this.f$0.uiRunnableCacheFinishedImpl();
                break;
            case 4:
                this.f$0.loadFrameRunnableInternal();
                break;
            case 5:
                this.f$0.lambda$uiRunnableGenerateCacheImpl$2();
                break;
            default:
                this.f$0.checkChoreographerInternal();
                break;
        }
    }
}
