package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40344a;
    public final y9 f40345b;

    public q9(y9 y9Var, int i10) {
        this.f40344a = i10;
        this.f40345b = y9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40344a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.f40345b;
                y9Var.f43374a0 = floatValue;
                y9Var.f43375b.setAlpha(1.0f - floatValue);
                if (y9Var.Y == 3) {
                    y9Var.f43377c.setAlpha(1.0f - y9Var.f43374a0);
                }
                y9Var.v.setAlpha(1.0f - y9Var.f43374a0);
                y9Var.f43389x = (y9Var.f43374a0 * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                this.f40345b.v.invalidate();
                return;
        }
    }
}
