package org.telegram.ui.Components;

public final class AnimatedFileDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final AnimatedFileDrawable f$0;

    public AnimatedFileDrawable$$ExternalSyntheticLambda0(AnimatedFileDrawable animatedFileDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = animatedFileDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$uiRunnableGenerateCacheImpl$0();
                break;
            case 1:
                this.f$0.lambda$uiRunnableGenerateCacheImpl$1();
                break;
            case 2:
                this.f$0.checkChoreographerInternal();
                break;
            case 3:
                this.f$0.lambda$checkCacheCancel$2();
                break;
            case 4:
                this.f$0.uiRunnableNoFrameImpl();
                break;
            case 5:
                this.f$0.uiRunnableGenerateCacheImpl();
                break;
            case 6:
                this.f$0.uiRunnableImpl();
                break;
            case 7:
                this.f$0.loadFrameRunnableImpl();
                break;
            default:
                this.f$0.uiStartTaskImpl();
                break;
        }
    }
}
