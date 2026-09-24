package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class gy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34066a;
    public final ProfileActivity f34067b;

    public gy0(ProfileActivity profileActivity, int i10) {
        this.f34066a = i10;
        this.f34067b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34066a) {
            case 0:
                ProfileActivity profileActivity = this.f34067b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f34067b.f31672x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f34067b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f34067b.l5(true);
                return;
        }
    }
}
