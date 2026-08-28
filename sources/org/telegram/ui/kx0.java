package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class kx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39943a;
    public final ProfileActivity f39944b;

    public kx0(ProfileActivity profileActivity, int i9) {
        this.f39943a = i9;
        this.f39944b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39943a) {
            case 0:
                ProfileActivity profileActivity = this.f39944b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f39944b.f36052t0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f39944b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f39944b.l5(true);
                return;
        }
    }
}
