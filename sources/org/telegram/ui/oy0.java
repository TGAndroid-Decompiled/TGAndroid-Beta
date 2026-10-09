package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class oy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40619a;
    public final ProfileActivity f40620b;

    public oy0(ProfileActivity profileActivity, int i10) {
        this.f40619a = i10;
        this.f40620b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40619a) {
            case 0:
                ProfileActivity profileActivity = this.f40620b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f40620b.f34374x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f40620b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f40620b.l5(true);
                return;
        }
    }
}
