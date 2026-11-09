package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
public final class eu0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45515a;
    public final ProfileActivity f45516b;

    public eu0(ProfileActivity profileActivity, int i7) {
        this.f45515a = i7;
        this.f45516b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f45515a;
        ProfileActivity profileActivity = this.f45516b;
        switch (i7) {
            case 0:
                profileActivity.f41861x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.a5(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                RectF rectF2 = ProfileActivity.V6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.O5(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.V6;
                profileActivity.O5(true);
                return;
        }
    }
}
