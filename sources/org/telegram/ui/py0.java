package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class py0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36723a;
    public final ProfileActivity f36724b;

    public py0(ProfileActivity profileActivity, int i10) {
        this.f36723a = i10;
        this.f36724b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36723a) {
            case 0:
                ProfileActivity profileActivity = this.f36724b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f36724b.f31684x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36724b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f36724b.l5(true);
                return;
        }
    }
}
