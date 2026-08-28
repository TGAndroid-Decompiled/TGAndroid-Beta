package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24370a;
    public final r2 f24371b;

    public g2(r2 r2Var, int i9) {
        this.f24370a = i9;
        this.f24371b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24370a) {
            case 0:
                r2 r2Var = this.f24371b;
                r2Var.getClass();
                r2Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f24371b;
                r2Var2.getClass();
                r2Var2.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f24371b;
                r2Var3.getClass();
                r2Var3.f25036q4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var3.invalidate();
                return;
        }
    }
}
