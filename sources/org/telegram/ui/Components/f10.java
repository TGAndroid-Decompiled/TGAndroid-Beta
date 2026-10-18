package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26030a;
    public final g10 f26031b;

    public f10(g10 g10Var, int i10) {
        this.f26030a = i10;
        this.f26031b = g10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26030a) {
            case 0:
                g10 g10Var = this.f26031b;
                g10Var.getClass();
                g10Var.f26443x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var.invalidate();
                return;
            case 1:
                g10 g10Var2 = this.f26031b;
                g10Var2.getClass();
                g10Var2.f26441s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                g10Var2.invalidate();
                return;
            default:
                g10 g10Var3 = this.f26031b;
                g10Var3.getClass();
                g10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var3.invalidate();
                return;
        }
    }
}
