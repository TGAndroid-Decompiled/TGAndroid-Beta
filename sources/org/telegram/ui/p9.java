package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37218a;
    public final v9 f37219b;

    public p9(v9 v9Var, int i10) {
        this.f37218a = i10;
        this.f37219b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37218a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = this.f37219b;
                v9Var.U = floatValue;
                v9Var.f39107a.setAlpha(1.0f - floatValue);
                if (v9Var.S == 3) {
                    v9Var.f39109b.setAlpha(1.0f - v9Var.U);
                }
                v9Var.f39114r.setAlpha(1.0f - v9Var.U);
                v9Var.v = (v9Var.U * 0.25f) + 0.5f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                this.f37219b.f39114r.invalidate();
                return;
        }
    }
}
