package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37792a;
    public final ProfileActivity f37793b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f37792a = i10;
        this.f37793b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37792a) {
            case 0:
                ProfileActivity profileActivity = this.f37793b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f37793b.f34371x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37793b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f37793b.l5(true);
                return;
        }
    }
}
