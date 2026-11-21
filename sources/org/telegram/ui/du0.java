package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
public final class du0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47042a;
    public final ProfileActivity f47043b;

    public du0(ProfileActivity profileActivity, int i7) {
        this.f47042a = i7;
        this.f47043b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f47042a;
        ProfileActivity profileActivity = this.f47043b;
        switch (i7) {
            case 0:
                profileActivity.f43720y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.a5(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                RectF rectF2 = ProfileActivity.Z6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.P5(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.P5(true);
                return;
        }
    }
}
