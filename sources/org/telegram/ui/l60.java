package org.telegram.ui;

import android.animation.ValueAnimator;
public final class l60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47113a;
    public final LaunchActivity f47114b;

    public l60(LaunchActivity launchActivity, int i3) {
        this.f47113a = i3;
        this.f47114b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f47113a;
        LaunchActivity launchActivity = this.f47114b;
        switch (i3) {
            case 0:
                launchActivity.f41326x0.invalidate();
                return;
            default:
                String str = LaunchActivity.E1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
