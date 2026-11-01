package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
public final class kv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39008a;
    public final ProfileActivity f39009b;

    public kv0(ProfileActivity profileActivity, int i10) {
        this.f39008a = i10;
        this.f39009b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f39008a;
        ProfileActivity profileActivity = this.f39009b;
        switch (i10) {
            case 0:
                profileActivity.f33943x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
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
