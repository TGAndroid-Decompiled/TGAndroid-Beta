package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23137a;
    public final j00 f23138b;

    public c00(j00 j00Var, int i10) {
        this.f23137a = i10;
        this.f23138b = j00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23137a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00 j00Var = this.f23138b;
                j00Var.f25227x = floatValue;
                j00Var.invalidate();
                return;
            default:
                j00 j00Var2 = this.f23138b;
                j00Var2.getClass();
                j00Var2.f25228y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var2.invalidate();
                return;
        }
    }
}
