package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30124a;
    public final tg0 f30125b;

    public rg0(tg0 tg0Var, int i10) {
        this.f30124a = i10;
        this.f30125b = tg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30124a) {
            case 0:
                tg0 tg0Var = this.f30125b;
                tg0Var.getClass();
                tg0Var.f30842y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var.invalidate();
                return;
            default:
                tg0 tg0Var2 = this.f30125b;
                tg0Var2.getClass();
                tg0Var2.f30842y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var2.invalidate();
                return;
        }
    }
}
