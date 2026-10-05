package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37800a;
    public final ProfileActivity f37801b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f37800a = i10;
        this.f37801b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37800a) {
            case 0:
                ProfileActivity profileActivity = this.f37801b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f37801b.f34384x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37801b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f37801b.l5(true);
                return;
        }
    }
}
