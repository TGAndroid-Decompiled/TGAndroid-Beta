package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23097a;
    public final b4 f23098b;

    public t3(b4 b4Var, int i10) {
        this.f23097a = i10;
        this.f23098b = b4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23097a) {
            case 0:
                b4 b4Var = this.f23098b;
                b4Var.getClass();
                b4Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                return;
            case 1:
                b4 b4Var2 = this.f23098b;
                b4Var2.getClass();
                b4Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var2.invalidate();
                return;
            default:
                b4 b4Var3 = this.f23098b;
                b4Var3.getClass();
                b4Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
