package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

public final class lx0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f40262a;

    public final ProfileActivity f40263b;

    public lx0(ProfileActivity profileActivity, int i10) {
        this.f40262a = i10;
        this.f40263b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40262a) {
            case 0:
                ProfileActivity profileActivity = this.f40263b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                break;
            case 1:
                this.f40263b.f36055t0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                break;
            case 2:
                ProfileActivity profileActivity2 = this.f40263b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                break;
            default:
                this.f40263b.l5(true);
                break;
        }
    }
}
