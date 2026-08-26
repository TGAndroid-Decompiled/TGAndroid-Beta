package org.telegram.ui;

import android.animation.ValueAnimator;

public final class LaunchActivity$$ExternalSyntheticLambda33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda33(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$155(valueAnimator);
                break;
            default:
                this.f$0.lambda$animateNavigationBarColor$178(valueAnimator);
                break;
        }
    }
}
