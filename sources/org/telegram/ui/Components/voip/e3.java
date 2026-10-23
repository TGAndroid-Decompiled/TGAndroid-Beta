package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31405a;
    public final h3 f31406b;

    public e3(h3 h3Var, int i10) {
        this.f31405a = i10;
        this.f31406b = h3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31405a) {
            case 0:
                h3 h3Var = this.f31406b;
                h3Var.getClass();
                h3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.invalidate();
                return;
            case 1:
                h3 h3Var2 = this.f31406b;
                h3Var2.getClass();
                h3Var2.f31465w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var2.invalidate();
                return;
            case 2:
                h3 h3Var3 = this.f31406b;
                h3Var3.getClass();
                h3Var3.f31464s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var3.invalidate();
                return;
            default:
                h3 h3Var4 = this.f31406b;
                h3Var4.getClass();
                h3Var4.f31463r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var4.invalidate();
                return;
        }
    }
}
