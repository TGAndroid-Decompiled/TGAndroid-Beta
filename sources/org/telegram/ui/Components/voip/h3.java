package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29327a;
    public final k3 f29328b;

    public h3(k3 k3Var, int i10) {
        this.f29327a = i10;
        this.f29328b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29327a) {
            case 0:
                k3 k3Var = this.f29328b;
                k3Var.getClass();
                k3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                return;
            case 1:
                k3 k3Var2 = this.f29328b;
                k3Var2.getClass();
                k3Var2.f29383w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var2.invalidate();
                return;
            case 2:
                k3 k3Var3 = this.f29328b;
                k3Var3.getClass();
                k3Var3.f29382s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var3.invalidate();
                return;
            default:
                k3 k3Var4 = this.f29328b;
                k3Var4.getClass();
                k3Var4.f29381r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var4.invalidate();
                return;
        }
    }
}
