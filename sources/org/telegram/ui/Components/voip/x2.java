package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39623a;
    public final a3 f39624b;

    public x2(a3 a3Var, int i7) {
        this.f39623a = i7;
        this.f39624b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39623a) {
            case 0:
                a3 a3Var = this.f39624b;
                a3Var.getClass();
                a3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                return;
            case 1:
                a3 a3Var2 = this.f39624b;
                a3Var2.getClass();
                a3Var2.f39106x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var2.invalidate();
                return;
            case 2:
                a3 a3Var3 = this.f39624b;
                a3Var3.getClass();
                a3Var3.f39104s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var3.invalidate();
                return;
            default:
                a3 a3Var4 = this.f39624b;
                a3Var4.getClass();
                a3Var4.f39103r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var4.invalidate();
                return;
        }
    }
}
