package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23948a;
    public final gg0 f23949b;

    public eg0(gg0 gg0Var, int i10) {
        this.f23948a = i10;
        this.f23949b = gg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23948a) {
            case 0:
                gg0 gg0Var = this.f23949b;
                gg0Var.getClass();
                gg0Var.f24527y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var.invalidate();
                return;
            default:
                gg0 gg0Var2 = this.f23949b;
                gg0Var2.getClass();
                gg0Var2.f24527y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var2.invalidate();
                return;
        }
    }
}
