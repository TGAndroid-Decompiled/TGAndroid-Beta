package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class iy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34282a;
    public final ProfileActivity f34283b;

    public iy0(ProfileActivity profileActivity, int i10) {
        this.f34282a = i10;
        this.f34283b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34282a) {
            case 0:
                ProfileActivity profileActivity = this.f34283b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f34283b.f31371x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f34283b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f34283b.l5(true);
                return;
        }
    }
}
