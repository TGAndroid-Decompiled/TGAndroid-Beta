package org.telegram.ui.Components;

import org.telegram.messenger.utils.Choreographer60FpsContent;

public final class RLottieDrawable$$ExternalSyntheticLambda5 implements Choreographer60FpsContent.FrameCallback {
    public final int $r8$classId;
    public final Object f$0;

    public RLottieDrawable$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void doFrame(long j) {
        switch (this.$r8$classId) {
            case 0:
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.f$0;
                int i = rLottieDrawable.ticksWithoutDraw + 1;
                rLottieDrawable.ticksWithoutDraw = i;
                if (i > 10) {
                    rLottieDrawable.isPaused = true;
                }
                rLottieDrawable.checkChoreographerInternal$1();
                if (rLottieDrawable.isChoreographerRegistered) {
                    rLottieDrawable.swapBuffersAllowedByChoreographer = true;
                    rLottieDrawable.invalidateInternal();
                }
                break;
            case 1:
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) this.f$0;
                int i2 = animatedFileDrawable.ticksWithoutDraw + 1;
                animatedFileDrawable.ticksWithoutDraw = i2;
                if (i2 > 10) {
                    animatedFileDrawable.isPaused = true;
                }
                animatedFileDrawable.checkChoreographerInternal();
                if (animatedFileDrawable.isChoreographerRegistered) {
                    animatedFileDrawable.swapBuffersAllowedByChoreographer = true;
                    animatedFileDrawable.invalidateInternal();
                }
                break;
            default:
                ((EditTextBoldCursor) this.f$0).lambda$new$0(j);
                break;
        }
    }
}
