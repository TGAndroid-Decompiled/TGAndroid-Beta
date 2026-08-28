package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33511a;
    public final i3 f33512b;

    public f3(i3 i3Var, int i9) {
        this.f33511a = i9;
        this.f33512b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33511a) {
            case 0:
                i3 i3Var = this.f33512b;
                i3Var.getClass();
                i3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3Var.invalidate();
                return;
            case 1:
                i3 i3Var2 = this.f33512b;
                i3Var2.getClass();
                i3Var2.f33574w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var2.invalidate();
                return;
            case 2:
                i3 i3Var3 = this.f33512b;
                i3Var3.getClass();
                i3Var3.f33573s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var3.invalidate();
                return;
            default:
                i3 i3Var4 = this.f33512b;
                i3Var4.getClass();
                i3Var4.f33572r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var4.invalidate();
                return;
        }
    }
}
