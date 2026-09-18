package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20351a;
    public final s2 f20352b;

    public h2(s2 s2Var, int i10) {
        this.f20351a = i10;
        this.f20352b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20351a) {
            case 0:
                s2 s2Var = this.f20352b;
                s2Var.getClass();
                s2Var.R3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.invalidate();
                return;
            case 1:
                s2 s2Var2 = this.f20352b;
                s2Var2.getClass();
                s2Var2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var2.invalidate();
                return;
            default:
                s2 s2Var3 = this.f20352b;
                s2Var3.getClass();
                s2Var3.f20988u4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var3.invalidate();
                return;
        }
    }
}
