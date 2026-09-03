package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23785a;
    public final i00 f23786b;

    public c00(i00 i00Var, int i10) {
        this.f23785a = i10;
        this.f23786b = i00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23785a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00 i00Var = this.f23786b;
                i00Var.f25550x = floatValue;
                i00Var.invalidate();
                return;
            default:
                i00 i00Var2 = this.f23786b;
                i00Var2.getClass();
                i00Var2.f25551y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var2.invalidate();
                return;
        }
    }
}
