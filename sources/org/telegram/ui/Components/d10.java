package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25510a;
    public final e10 f25511b;

    public d10(e10 e10Var, int i10) {
        this.f25510a = i10;
        this.f25511b = e10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25510a) {
            case 0:
                e10 e10Var = this.f25511b;
                e10Var.getClass();
                e10Var.f25920y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e10Var.invalidate();
                return;
            case 1:
                e10 e10Var2 = this.f25511b;
                e10Var2.getClass();
                e10Var2.v = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e10Var2.invalidate();
                return;
            default:
                e10 e10Var3 = this.f25511b;
                e10Var3.getClass();
                e10Var3.f25915n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e10Var3.invalidate();
                return;
        }
    }
}
