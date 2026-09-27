package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24063a;
    public final gg0 f24064b;

    public eg0(gg0 gg0Var, int i10) {
        this.f24063a = i10;
        this.f24064b = gg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24063a) {
            case 0:
                gg0 gg0Var = this.f24064b;
                gg0Var.getClass();
                gg0Var.f24577y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var.invalidate();
                return;
            default:
                gg0 gg0Var2 = this.f24064b;
                gg0Var2.getClass();
                gg0Var2.f24577y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var2.invalidate();
                return;
        }
    }
}
