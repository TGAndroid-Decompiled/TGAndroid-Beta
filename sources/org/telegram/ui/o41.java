package org.telegram.ui;

import android.animation.ValueAnimator;
public final class o41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35397a;
    public final r41 f35398b;

    public o41(r41 r41Var, int i10) {
        this.f35397a = i10;
        this.f35398b = r41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35397a) {
            case 0:
                r41 r41Var = this.f35398b;
                r41Var.getClass();
                r41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r41Var.g();
                return;
            case 1:
                r41 r41Var2 = this.f35398b;
                r41Var2.getClass();
                r41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r41Var2.g();
                return;
            default:
                r41 r41Var3 = this.f35398b;
                r41Var3.getClass();
                r41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r41Var3.g();
                return;
        }
    }
}
