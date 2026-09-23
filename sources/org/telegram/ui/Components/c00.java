package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22874a;
    public final j00 f22875b;

    public c00(j00 j00Var, int i10) {
        this.f22874a = i10;
        this.f22875b = j00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22874a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00 j00Var = this.f22875b;
                j00Var.f25107x = floatValue;
                j00Var.invalidate();
                return;
            default:
                j00 j00Var2 = this.f22875b;
                j00Var2.getClass();
                j00Var2.f25108y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var2.invalidate();
                return;
        }
    }
}
