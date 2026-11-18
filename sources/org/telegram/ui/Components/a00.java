package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33197a;
    public final c00 f33198b;

    public a00(c00 c00Var, int i7) {
        this.f33197a = i7;
        this.f33198b = c00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33197a) {
            case 0:
                c00 c00Var = this.f33198b;
                c00Var.getClass();
                c00Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var.invalidate();
                return;
            case 1:
                c00 c00Var2 = this.f33198b;
                c00Var2.getClass();
                c00Var2.f33834w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var2.invalidate();
                return;
            default:
                c00 c00Var3 = this.f33198b;
                c00Var3.getClass();
                c00Var3.f33831n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var3.invalidate();
                return;
        }
    }
}
