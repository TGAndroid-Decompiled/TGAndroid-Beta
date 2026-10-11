package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class st0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30861a;
    public final wu0 f30862b;
    public final dw0 f30863c;

    public st0(dw0 dw0Var, wu0 wu0Var, int i10) {
        this.f30861a = i10;
        this.f30863c = dw0Var;
        this.f30862b = wu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30861a) {
            case 0:
                this.f30863c.f25717n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30862b.h.invalidate();
                return;
            default:
                this.f30863c.f25717n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f30862b.h.invalidate();
                return;
        }
    }
}
