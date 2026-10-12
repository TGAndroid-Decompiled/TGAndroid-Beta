package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26151a;
    public final k10 f26152b;

    public j10(k10 k10Var, int i10) {
        this.f26151a = i10;
        this.f26152b = k10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26151a) {
            case 0:
                k10 k10Var = this.f26152b;
                k10Var.getClass();
                k10Var.f26541x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var.invalidate();
                return;
            case 1:
                k10 k10Var2 = this.f26152b;
                k10Var2.getClass();
                k10Var2.f26539s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k10Var2.invalidate();
                return;
            default:
                k10 k10Var3 = this.f26152b;
                k10Var3.getClass();
                k10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var3.invalidate();
                return;
        }
    }
}
