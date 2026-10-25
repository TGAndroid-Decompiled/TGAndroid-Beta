package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33166a;
    public final wx0 f33167b;

    public tx0(wx0 wx0Var, int i10) {
        this.f33166a = i10;
        this.f33167b = wx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33166a) {
            case 0:
                wx0 wx0Var = this.f33167b;
                wx0Var.getClass();
                wx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.invalidate();
                return;
            case 1:
                wx0 wx0Var2 = this.f33167b;
                wx0Var2.getClass();
                wx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wx0 wx0Var3 = this.f33167b;
                wx0Var3.getClass();
                wx0Var3.f34547y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var3.invalidate();
                return;
        }
    }
}
