package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class k2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31002a;
    public final u2 f31003b;

    public k2(u2 u2Var, int i7) {
        this.f31002a = i7;
        this.f31003b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31002a) {
            case 0:
                u2 u2Var = this.f31003b;
                u2Var.getClass();
                u2Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                return;
            case 1:
                u2 u2Var2 = this.f31003b;
                u2Var2.getClass();
                u2Var2.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                return;
            default:
                u2 u2Var3 = this.f31003b;
                u2Var3.getClass();
                u2Var3.f32103z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var3.invalidate();
                return;
        }
    }
}
