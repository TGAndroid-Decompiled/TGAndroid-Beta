package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
public final class lv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39418a;
    public final ProfileActivity f39419b;

    public lv0(ProfileActivity profileActivity, int i10) {
        this.f39418a = i10;
        this.f39419b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f39418a;
        ProfileActivity profileActivity = this.f39419b;
        switch (i10) {
            case 0:
                profileActivity.f33936x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.W4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                RectF rectF2 = ProfileActivity.R6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.K5(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.R6;
                profileActivity.K5(true);
                return;
        }
    }
}
