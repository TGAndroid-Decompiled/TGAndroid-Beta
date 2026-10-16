package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29850a;
    public final i3 f29851b;

    public f3(i3 i3Var, int i10) {
        this.f29850a = i10;
        this.f29851b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29850a) {
            case 0:
                i3 i3Var = this.f29851b;
                i3Var.getClass();
                i3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3Var.invalidate();
                return;
            case 1:
                i3 i3Var2 = this.f29851b;
                i3Var2.getClass();
                i3Var2.f29906w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var2.invalidate();
                return;
            case 2:
                i3 i3Var3 = this.f29851b;
                i3Var3.getClass();
                i3Var3.f29905s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var3.invalidate();
                return;
            default:
                i3 i3Var4 = this.f29851b;
                i3Var4.getClass();
                i3Var4.f29904r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var4.invalidate();
                return;
        }
    }
}
