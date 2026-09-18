package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36385a;
    public final v9 f36386b;

    public p9(v9 v9Var, int i10) {
        this.f36385a = i10;
        this.f36386b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36385a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = this.f36386b;
                v9Var.X = floatValue;
                v9Var.f38367a.setAlpha(1.0f - floatValue);
                if (v9Var.V == 3) {
                    v9Var.f38369b.setAlpha(1.0f - v9Var.X);
                }
                v9Var.f38377r.setAlpha(1.0f - v9Var.X);
                v9Var.v = (v9Var.X * 0.25f) + 0.5f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                this.f36386b.f38377r.invalidate();
                return;
        }
    }
}
