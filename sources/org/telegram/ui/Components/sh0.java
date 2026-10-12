package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29134a;
    public final vh0 f29135b;

    public sh0(vh0 vh0Var, int i10) {
        this.f29134a = i10;
        this.f29135b = vh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29134a) {
            case 0:
                vh0 vh0Var = this.f29135b;
                vh0Var.getClass();
                vh0Var.f29975b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh0Var.c(true);
                return;
            default:
                vh0 vh0Var2 = this.f29135b;
                vh0Var2.getClass();
                vh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh0Var2.c(true);
                return;
        }
    }
}
