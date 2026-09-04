package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21965a;
    public final r2 f21966b;

    public g2(r2 r2Var, int i10) {
        this.f21965a = i10;
        this.f21966b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21965a) {
            case 0:
                r2 r2Var = this.f21966b;
                r2Var.getClass();
                r2Var.R3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f21966b;
                r2Var2.getClass();
                r2Var2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f21966b;
                r2Var3.getClass();
                r2Var3.f22637u4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var3.invalidate();
                return;
        }
    }
}
