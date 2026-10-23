package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26123a;
    public final g10 f26124b;

    public f10(g10 g10Var, int i10) {
        this.f26123a = i10;
        this.f26124b = g10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26123a) {
            case 0:
                g10 g10Var = this.f26124b;
                g10Var.getClass();
                g10Var.f26510y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var.invalidate();
                return;
            case 1:
                g10 g10Var2 = this.f26124b;
                g10Var2.getClass();
                g10Var2.v = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                g10Var2.invalidate();
                return;
            default:
                g10 g10Var3 = this.f26124b;
                g10Var3.getClass();
                g10Var3.f26505n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var3.invalidate();
                return;
        }
    }
}
