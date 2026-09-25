package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30713a;
    public final bx0 f30714b;

    public yw0(bx0 bx0Var, int i10) {
        this.f30713a = i10;
        this.f30714b = bx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30713a) {
            case 0:
                bx0 bx0Var = this.f30714b;
                bx0Var.getClass();
                bx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bx0Var.invalidate();
                return;
            case 1:
                bx0 bx0Var2 = this.f30714b;
                bx0Var2.getClass();
                bx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                bx0 bx0Var3 = this.f30714b;
                bx0Var3.getClass();
                bx0Var3.f23121y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bx0Var3.invalidate();
                return;
        }
    }
}
