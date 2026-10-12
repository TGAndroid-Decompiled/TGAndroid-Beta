package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30181a;
    public final i3 f30182b;

    public f3(i3 i3Var, int i10) {
        this.f30181a = i10;
        this.f30182b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30181a) {
            case 0:
                i3 i3Var = this.f30182b;
                i3Var.getClass();
                i3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3Var.invalidate();
                return;
            case 1:
                i3 i3Var2 = this.f30182b;
                i3Var2.getClass();
                i3Var2.f30237w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var2.invalidate();
                return;
            case 2:
                i3 i3Var3 = this.f30182b;
                i3Var3.getClass();
                i3Var3.f30236s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var3.invalidate();
                return;
            default:
                i3 i3Var4 = this.f30182b;
                i3Var4.getClass();
                i3Var4.f30235r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var4.invalidate();
                return;
        }
    }
}
