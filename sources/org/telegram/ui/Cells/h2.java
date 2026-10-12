package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21958a;
    public final s2 f21959b;

    public h2(s2 s2Var, int i10) {
        this.f21958a = i10;
        this.f21959b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21958a) {
            case 0:
                s2 s2Var = this.f21959b;
                s2Var.getClass();
                s2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.invalidate();
                return;
            case 1:
                s2 s2Var2 = this.f21959b;
                s2Var2.getClass();
                s2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var2.invalidate();
                return;
            default:
                s2 s2Var3 = this.f21959b;
                s2Var3.getClass();
                s2Var3.f22655y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var3.invalidate();
                return;
        }
    }
}
