package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37786a;
    public final ProfileActivity f37787b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f37786a = i10;
        this.f37787b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37786a) {
            case 0:
                ProfileActivity profileActivity = this.f37787b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f37787b.f34364x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37787b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f37787b.l5(true);
                return;
        }
    }
}
