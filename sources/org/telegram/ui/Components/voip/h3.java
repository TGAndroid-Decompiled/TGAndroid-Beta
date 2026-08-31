package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32083a;
    public final k3 f32084b;

    public h3(k3 k3Var, int i10) {
        this.f32083a = i10;
        this.f32084b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32083a) {
            case 0:
                k3 k3Var = this.f32084b;
                k3Var.getClass();
                k3Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                return;
            case 1:
                k3 k3Var2 = this.f32084b;
                k3Var2.getClass();
                k3Var2.f32130w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var2.invalidate();
                return;
            case 2:
                k3 k3Var3 = this.f32084b;
                k3Var3.getClass();
                k3Var3.f32129s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var3.invalidate();
                return;
            default:
                k3 k3Var4 = this.f32084b;
                k3Var4.getClass();
                k3Var4.f32128r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var4.invalidate();
                return;
        }
    }
}
