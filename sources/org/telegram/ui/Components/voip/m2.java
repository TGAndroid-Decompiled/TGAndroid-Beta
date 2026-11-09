package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class m2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39457a;
    public final n2 f39458b;

    public m2(n2 n2Var, int i7) {
        this.f39457a = i7;
        this.f39458b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39457a) {
            case 0:
                n2 n2Var = this.f39458b;
                n2Var.getClass();
                n2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.a(n2Var.R, n2Var.S);
                return;
            default:
                n2 n2Var2 = this.f39458b;
                n2Var2.getClass();
                n2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var2.invalidate();
                return;
        }
    }
}
