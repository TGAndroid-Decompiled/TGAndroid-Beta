package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22324a;
    public final r2 f22325b;

    public h2(r2 r2Var, int i10) {
        this.f22324a = i10;
        this.f22325b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22324a) {
            case 0:
                r2 r2Var = this.f22325b;
                r2Var.getClass();
                r2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f22325b;
                r2Var2.getClass();
                r2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f22325b;
                r2Var3.getClass();
                r2Var3.f22930y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var3.invalidate();
                return;
        }
    }
}
