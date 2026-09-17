package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39644a;
    public final zv0 f39645b;

    public pv0(zv0 zv0Var, int i10) {
        this.f39644a = i10;
        this.f39645b = zv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39644a) {
            case 0:
                zv0 zv0Var = this.f39645b;
                zv0Var.getClass();
                zv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zv0 zv0Var2 = this.f39645b;
                zv0Var2.getClass();
                zv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
