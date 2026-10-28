package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28811a;
    public final j10 f28812b;

    public h10(j10 j10Var, int i10) {
        this.f28811a = i10;
        this.f28812b = j10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28811a) {
            case 0:
                j10 j10Var = this.f28812b;
                j10Var.getClass();
                j10Var.f29469y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j10Var.invalidate();
                return;
            case 1:
                j10 j10Var2 = this.f28812b;
                j10Var2.getClass();
                j10Var2.v = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                j10Var2.invalidate();
                return;
            default:
                j10 j10Var3 = this.f28812b;
                j10Var3.getClass();
                j10Var3.f29464n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j10Var3.invalidate();
                return;
        }
    }
}
