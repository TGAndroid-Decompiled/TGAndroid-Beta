package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31382a;
    public final bg0 f31383b;

    public zf0(bg0 bg0Var, int i10) {
        this.f31382a = i10;
        this.f31383b = bg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31382a) {
            case 0:
                bg0 bg0Var = this.f31383b;
                bg0Var.getClass();
                bg0Var.f23679y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.invalidate();
                return;
            default:
                bg0 bg0Var2 = this.f31383b;
                bg0Var2.getClass();
                bg0Var2.f23679y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var2.invalidate();
                return;
        }
    }
}
