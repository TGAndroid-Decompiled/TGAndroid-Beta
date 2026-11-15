package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50141a;
    public final LaunchActivity f50142b;

    public p60(LaunchActivity launchActivity, int i7) {
        this.f50141a = i7;
        this.f50142b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f50141a;
        LaunchActivity launchActivity = this.f50142b;
        switch (i7) {
            case 0:
                launchActivity.f42661v0.invalidate();
                return;
            default:
                String str = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
