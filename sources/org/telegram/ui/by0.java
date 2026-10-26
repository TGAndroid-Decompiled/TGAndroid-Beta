package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class by0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38185a;
    public final ProfileActivity f38186b;

    public by0(ProfileActivity profileActivity, int i10) {
        this.f38185a = i10;
        this.f38186b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f38185a;
        ProfileActivity profileActivity = this.f38186b;
        switch (i10) {
            case 0:
                profileActivity.f36112x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                int i11 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.R4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                int i12 = ProfileActivity.R6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.x5(true);
                return;
            default:
                int i13 = ProfileActivity.R6;
                profileActivity.x5(true);
                return;
        }
    }
}
