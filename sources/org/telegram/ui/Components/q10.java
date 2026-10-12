package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29625a;
    public final r10 f29626b;

    public q10(r10 r10Var, int i10) {
        this.f29625a = i10;
        this.f29626b = r10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29625a) {
            case 0:
                r10 r10Var = this.f29626b;
                r10Var.getClass();
                r10Var.f29985x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r10Var.invalidate();
                return;
            case 1:
                r10 r10Var2 = this.f29626b;
                r10Var2.getClass();
                r10Var2.f29983s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                r10Var2.invalidate();
                return;
            default:
                r10 r10Var3 = this.f29626b;
                r10Var3.getClass();
                r10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r10Var3.invalidate();
                return;
        }
    }
}
