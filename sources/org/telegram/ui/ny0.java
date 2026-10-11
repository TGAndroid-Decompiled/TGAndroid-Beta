package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ny0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40407a;
    public final ProfileActivity f40408b;

    public ny0(ProfileActivity profileActivity, int i10) {
        this.f40407a = i10;
        this.f40408b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40407a) {
            case 0:
                ProfileActivity profileActivity = this.f40408b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f40408b.f34436x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f40408b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f40408b.l5(true);
                return;
        }
    }
}
