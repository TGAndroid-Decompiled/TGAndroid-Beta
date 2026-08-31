package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22831a;
    public final r2 f22832b;

    public g2(r2 r2Var, int i10) {
        this.f22831a = i10;
        this.f22832b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22831a) {
            case 0:
                r2 r2Var = this.f22832b;
                r2Var.getClass();
                r2Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f22832b;
                r2Var2.getClass();
                r2Var2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f22832b;
                r2Var3.getClass();
                r2Var3.f23499r4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var3.invalidate();
                return;
        }
    }
}
