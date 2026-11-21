package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33959a;
    public final e00 f33960b;

    public c00(e00 e00Var, int i7) {
        this.f33959a = i7;
        this.f33960b = e00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33959a) {
            case 0:
                e00 e00Var = this.f33960b;
                e00Var.getClass();
                e00Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e00Var.invalidate();
                return;
            case 1:
                e00 e00Var2 = this.f33960b;
                e00Var2.getClass();
                e00Var2.f34636w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e00Var2.invalidate();
                return;
            default:
                e00 e00Var3 = this.f33960b;
                e00Var3.getClass();
                e00Var3.f34633n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e00Var3.invalidate();
                return;
        }
    }
}
