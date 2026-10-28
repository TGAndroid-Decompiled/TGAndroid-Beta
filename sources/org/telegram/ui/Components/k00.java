package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29797a;
    public final q00 f29798b;

    public k00(q00 q00Var, int i10) {
        this.f29797a = i10;
        this.f29798b = q00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29797a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00 q00Var = this.f29798b;
                q00Var.f31763x = floatValue;
                q00Var.invalidate();
                return;
            default:
                q00 q00Var2 = this.f29798b;
                q00Var2.getClass();
                q00Var2.f31764y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00Var2.invalidate();
                return;
        }
    }
}
