package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39700a;
    public final ProfileActivity f39701b;

    public jx0(ProfileActivity profileActivity, int i10) {
        this.f39700a = i10;
        this.f39701b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39700a) {
            case 0:
                ProfileActivity profileActivity = this.f39701b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f39701b.f36117t0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f39701b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f39701b.l5(true);
                return;
        }
    }
}
