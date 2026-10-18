package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40302a;
    public final y9 f40303b;

    public q9(y9 y9Var, int i10) {
        this.f40302a = i10;
        this.f40303b = y9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40302a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.f40303b;
                y9Var.f43336a0 = floatValue;
                y9Var.f43337b.setAlpha(1.0f - floatValue);
                if (y9Var.Y == 3) {
                    y9Var.f43339c.setAlpha(1.0f - y9Var.f43336a0);
                }
                y9Var.v.setAlpha(1.0f - y9Var.f43336a0);
                y9Var.f43351x = (y9Var.f43336a0 * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                this.f40303b.v.invalidate();
                return;
        }
    }
}
