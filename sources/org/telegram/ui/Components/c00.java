package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23108a;
    public final j00 f23109b;

    public c00(j00 j00Var, int i10) {
        this.f23108a = i10;
        this.f23109b = j00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23108a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00 j00Var = this.f23109b;
                j00Var.f25202x = floatValue;
                j00Var.invalidate();
                return;
            default:
                j00 j00Var2 = this.f23109b;
                j00Var2.getClass();
                j00Var2.f25203y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var2.invalidate();
                return;
        }
    }
}
