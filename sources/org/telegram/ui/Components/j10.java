package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class j10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25845a;
    public final k10 f25846b;

    public j10(k10 k10Var, int i10) {
        this.f25845a = i10;
        this.f25846b = k10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25845a) {
            case 0:
                k10 k10Var = this.f25846b;
                k10Var.getClass();
                k10Var.f26176x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var.invalidate();
                return;
            case 1:
                k10 k10Var2 = this.f25846b;
                k10Var2.getClass();
                k10Var2.f26174s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k10Var2.invalidate();
                return;
            default:
                k10 k10Var3 = this.f25846b;
                k10Var3.getClass();
                k10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var3.invalidate();
                return;
        }
    }
}
