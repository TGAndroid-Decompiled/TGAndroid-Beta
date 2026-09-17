package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class py0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39656a;
    public final ProfileActivity f39657b;

    public py0(ProfileActivity profileActivity, int i10) {
        this.f39656a = i10;
        this.f39657b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39656a) {
            case 0:
                ProfileActivity profileActivity = this.f39657b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f39657b.f34020x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f39657b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f39657b.l5(true);
                return;
        }
    }
}
