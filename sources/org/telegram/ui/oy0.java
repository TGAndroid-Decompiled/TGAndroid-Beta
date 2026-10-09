package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class oy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40621a;
    public final ProfileActivity f40622b;

    public oy0(ProfileActivity profileActivity, int i10) {
        this.f40621a = i10;
        this.f40622b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40621a) {
            case 0:
                ProfileActivity profileActivity = this.f40622b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f40622b.f34374x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f40622b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f40622b.l5(true);
                return;
        }
    }
}
