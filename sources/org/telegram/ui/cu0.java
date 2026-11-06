package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
public final class cu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44900a;
    public final ProfileActivity f44901b;

    public cu0(ProfileActivity profileActivity, int i7) {
        this.f44900a = i7;
        this.f44901b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f44900a;
        ProfileActivity profileActivity = this.f44901b;
        switch (i7) {
            case 0:
                profileActivity.f41850x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.X4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                RectF rectF2 = ProfileActivity.S6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.L5(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.L5(true);
                return;
        }
    }
}
