package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41215a;
    public final y9 f41216b;

    public q9(y9 y9Var, int i10) {
        this.f41215a = i10;
        this.f41216b = y9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41215a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.f41216b;
                y9Var.Z = floatValue;
                y9Var.f44326a.setAlpha(1.0f - floatValue);
                if (y9Var.X == 3) {
                    y9Var.f44328b.setAlpha(1.0f - y9Var.Z);
                }
                y9Var.f44340s.setAlpha(1.0f - y9Var.Z);
                y9Var.f44341w = (y9Var.Z * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                this.f41216b.f44340s.invalidate();
                return;
        }
    }
}
