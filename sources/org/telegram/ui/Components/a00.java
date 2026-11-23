package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33297a;
    public final c00 f33298b;

    public a00(c00 c00Var, int i7) {
        this.f33297a = i7;
        this.f33298b = c00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33297a) {
            case 0:
                c00 c00Var = this.f33298b;
                c00Var.getClass();
                c00Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var.invalidate();
                return;
            case 1:
                c00 c00Var2 = this.f33298b;
                c00Var2.getClass();
                c00Var2.f33872w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var2.invalidate();
                return;
            default:
                c00 c00Var3 = this.f33298b;
                c00Var3.getClass();
                c00Var3.f33869n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var3.invalidate();
                return;
        }
    }
}
