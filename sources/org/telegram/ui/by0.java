package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class by0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32958a;
    public final ProfileActivity f32959b;

    public by0(ProfileActivity profileActivity, int i10) {
        this.f32958a = i10;
        this.f32959b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32958a) {
            case 0:
                ProfileActivity profileActivity = this.f32959b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f32959b.f32142u0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f32959b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f32959b.l5(true);
                return;
        }
    }
}
