package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39650a;
    public final w9 f39651b;

    public q9(w9 w9Var, int i10) {
        this.f39650a = i10;
        this.f39651b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39650a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = this.f39651b;
                w9Var.X = floatValue;
                w9Var.f41968a.setAlpha(1.0f - floatValue);
                if (w9Var.V == 3) {
                    w9Var.f41970b.setAlpha(1.0f - w9Var.X);
                }
                w9Var.f41979r.setAlpha(1.0f - w9Var.X);
                w9Var.v = (w9Var.X * 0.25f) + 0.5f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                this.f39651b.f41979r.invalidate();
                return;
        }
    }
}
