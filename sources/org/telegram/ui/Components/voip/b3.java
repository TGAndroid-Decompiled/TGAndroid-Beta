package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40526a;
    public final e3 f40527b;

    public b3(e3 e3Var, int i7) {
        this.f40526a = i7;
        this.f40527b = e3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40526a) {
            case 0:
                e3 e3Var = this.f40527b;
                e3Var.getClass();
                e3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.invalidate();
                return;
            case 1:
                e3 e3Var2 = this.f40527b;
                e3Var2.getClass();
                e3Var2.f40598x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var2.invalidate();
                return;
            case 2:
                e3 e3Var3 = this.f40527b;
                e3Var3.getClass();
                e3Var3.f40596s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var3.invalidate();
                return;
            default:
                e3 e3Var4 = this.f40527b;
                e3Var4.getClass();
                e3Var4.f40595r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var4.invalidate();
                return;
        }
    }
}
