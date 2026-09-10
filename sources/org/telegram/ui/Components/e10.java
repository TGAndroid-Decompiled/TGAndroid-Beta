package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22533a;
    public final g10 f22534b;

    public e10(g10 g10Var, int i10) {
        this.f22533a = i10;
        this.f22534b = g10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22533a) {
            case 0:
                g10 g10Var = this.f22534b;
                g10Var.getClass();
                g10Var.f23203x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var.invalidate();
                return;
            case 1:
                g10 g10Var2 = this.f22534b;
                g10Var2.getClass();
                g10Var2.f23201s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                g10Var2.invalidate();
                return;
            default:
                g10 g10Var3 = this.f22534b;
                g10Var3.getClass();
                g10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var3.invalidate();
                return;
        }
    }
}
