package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class by0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35621a;
    public final ProfileActivity f35622b;

    public by0(ProfileActivity profileActivity, int i10) {
        this.f35621a = i10;
        this.f35622b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35621a) {
            case 0:
                ProfileActivity profileActivity = this.f35622b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f35622b.f34701u0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f35622b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f35622b.l5(true);
                return;
        }
    }
}
