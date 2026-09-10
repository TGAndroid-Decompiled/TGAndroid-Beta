package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23844a;
    public final p00 f23845b;

    public i00(p00 p00Var, int i10) {
        this.f23844a = i10;
        this.f23845b = p00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23844a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p00 p00Var = this.f23845b;
                p00Var.f25968x = floatValue;
                p00Var.invalidate();
                return;
            default:
                p00 p00Var2 = this.f23845b;
                p00Var2.getClass();
                p00Var2.f25969y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p00Var2.invalidate();
                return;
        }
    }
}
