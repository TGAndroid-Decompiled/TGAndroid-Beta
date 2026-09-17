package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31475a;
    public final h3 f31476b;

    public e3(h3 h3Var, int i10) {
        this.f31475a = i10;
        this.f31476b = h3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31475a) {
            case 0:
                h3 h3Var = this.f31476b;
                h3Var.getClass();
                h3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.invalidate();
                return;
            case 1:
                h3 h3Var2 = this.f31476b;
                h3Var2.getClass();
                h3Var2.f31539w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var2.invalidate();
                return;
            case 2:
                h3 h3Var3 = this.f31476b;
                h3Var3.getClass();
                h3Var3.f31538s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var3.invalidate();
                return;
            default:
                h3 h3Var4 = this.f31476b;
                h3Var4.getClass();
                h3Var4.f31537r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var4.invalidate();
                return;
        }
    }
}
