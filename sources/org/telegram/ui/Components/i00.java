package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29254a;
    public final j00 f29255b;

    public i00(j00 j00Var, int i9) {
        this.f29254a = i9;
        this.f29255b = j00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29254a) {
            case 0:
                j00 j00Var = this.f29255b;
                j00Var.getClass();
                j00Var.f29572x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var.invalidate();
                return;
            case 1:
                j00 j00Var2 = this.f29255b;
                j00Var2.getClass();
                j00Var2.f29570s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                j00Var2.invalidate();
                return;
            default:
                j00 j00Var3 = this.f29255b;
                j00Var3.getClass();
                j00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var3.invalidate();
                return;
        }
    }
}
