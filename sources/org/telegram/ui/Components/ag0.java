package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ag0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25252a;
    public final cg0 f25253b;

    public ag0(cg0 cg0Var, int i10) {
        this.f25252a = i10;
        this.f25253b = cg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25252a) {
            case 0:
                cg0 cg0Var = this.f25253b;
                cg0Var.getClass();
                cg0Var.f25937y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var.invalidate();
                return;
            default:
                cg0 cg0Var2 = this.f25253b;
                cg0Var2.getClass();
                cg0Var2.f25937y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var2.invalidate();
                return;
        }
    }
}
