package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39634a;
    public final a3 f39635b;

    public x2(a3 a3Var, int i7) {
        this.f39634a = i7;
        this.f39635b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39634a) {
            case 0:
                a3 a3Var = this.f39635b;
                a3Var.getClass();
                a3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                return;
            case 1:
                a3 a3Var2 = this.f39635b;
                a3Var2.getClass();
                a3Var2.f39115x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var2.invalidate();
                return;
            case 2:
                a3 a3Var3 = this.f39635b;
                a3Var3.getClass();
                a3Var3.f39113s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var3.invalidate();
                return;
            default:
                a3 a3Var4 = this.f39635b;
                a3Var4.getClass();
                a3Var4.f39112r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var4.invalidate();
                return;
        }
    }
}
