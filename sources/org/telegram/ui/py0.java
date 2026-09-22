package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class py0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36746a;
    public final ProfileActivity f36747b;

    public py0(ProfileActivity profileActivity, int i10) {
        this.f36746a = i10;
        this.f36747b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36746a) {
            case 0:
                ProfileActivity profileActivity = this.f36747b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f36747b.f31705x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36747b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f36747b.l5(true);
                return;
        }
    }
}
