package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class f3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33561a;

    public final i3 f33562b;

    public f3(i3 i3Var, int i10) {
        this.f33561a = i10;
        this.f33562b = i3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33561a) {
            case 0:
                i3 i3Var = this.f33562b;
                i3Var.getClass();
                i3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3Var.invalidate();
                break;
            case 1:
                i3 i3Var2 = this.f33562b;
                i3Var2.getClass();
                i3Var2.f33624w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var2.invalidate();
                break;
            case 2:
                i3 i3Var3 = this.f33562b;
                i3Var3.getClass();
                i3Var3.f33623s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var3.invalidate();
                break;
            default:
                i3 i3Var4 = this.f33562b;
                i3Var4.getClass();
                i3Var4.f33622r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var4.invalidate();
                break;
        }
    }
}
