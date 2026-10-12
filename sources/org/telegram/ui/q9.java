package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41219a;
    public final y9 f41220b;

    public q9(y9 y9Var, int i10) {
        this.f41219a = i10;
        this.f41220b = y9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41219a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.f41220b;
                y9Var.Z = floatValue;
                y9Var.f44331a.setAlpha(1.0f - floatValue);
                if (y9Var.X == 3) {
                    y9Var.f44333b.setAlpha(1.0f - y9Var.Z);
                }
                y9Var.f44345s.setAlpha(1.0f - y9Var.Z);
                y9Var.f44346w = (y9Var.Z * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                this.f41220b.f44345s.invalidate();
                return;
        }
    }
}
