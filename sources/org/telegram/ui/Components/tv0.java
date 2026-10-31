package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30692a;
    public final wv0 f30693b;

    public tv0(wv0 wv0Var, int i10) {
        this.f30692a = i10;
        this.f30693b = wv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30692a) {
            case 0:
                wv0 wv0Var = this.f30693b;
                wv0Var.getClass();
                wv0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wv0Var.invalidate();
                return;
            case 1:
                wv0 wv0Var2 = this.f30693b;
                wv0Var2.getClass();
                wv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wv0 wv0Var3 = this.f30693b;
                wv0Var3.getClass();
                wv0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wv0Var3.invalidate();
                return;
        }
    }
}
