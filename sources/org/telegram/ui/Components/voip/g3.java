package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29623a;
    public final j3 f29624b;

    public g3(j3 j3Var, int i10) {
        this.f29623a = i10;
        this.f29624b = j3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29623a) {
            case 0:
                j3 j3Var = this.f29624b;
                j3Var.getClass();
                j3Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var.invalidate();
                return;
            case 1:
                j3 j3Var2 = this.f29624b;
                j3Var2.getClass();
                j3Var2.f29677w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var2.invalidate();
                return;
            case 2:
                j3 j3Var3 = this.f29624b;
                j3Var3.getClass();
                j3Var3.f29676s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var3.invalidate();
                return;
            default:
                j3 j3Var4 = this.f29624b;
                j3Var4.getClass();
                j3Var4.f29675r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var4.invalidate();
                return;
        }
    }
}
