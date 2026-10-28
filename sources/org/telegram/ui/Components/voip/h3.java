package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33941a;
    public final k3 f33942b;

    public h3(k3 k3Var, int i10) {
        this.f33941a = i10;
        this.f33942b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33941a) {
            case 0:
                k3 k3Var = this.f33942b;
                k3Var.getClass();
                k3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                return;
            case 1:
                k3 k3Var2 = this.f33942b;
                k3Var2.getClass();
                k3Var2.f33999w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var2.invalidate();
                return;
            case 2:
                k3 k3Var3 = this.f33942b;
                k3Var3.getClass();
                k3Var3.f33998s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var3.invalidate();
                return;
            default:
                k3 k3Var4 = this.f33942b;
                k3Var4.getClass();
                k3Var4.f33997r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var4.invalidate();
                return;
        }
    }
}
