package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class gy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34082a;
    public final ProfileActivity f34083b;

    public gy0(ProfileActivity profileActivity, int i10) {
        this.f34082a = i10;
        this.f34083b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34082a) {
            case 0:
                ProfileActivity profileActivity = this.f34083b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f34083b.f31688x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f34083b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f34083b.l5(true);
                return;
        }
    }
}
