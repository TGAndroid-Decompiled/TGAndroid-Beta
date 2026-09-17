package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39671a;
    public final zv0 f39672b;

    public pv0(zv0 zv0Var, int i10) {
        this.f39671a = i10;
        this.f39672b = zv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39671a) {
            case 0:
                zv0 zv0Var = this.f39672b;
                zv0Var.getClass();
                zv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zv0 zv0Var2 = this.f39672b;
                zv0Var2.getClass();
                zv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
