package org.telegram.ui;

import android.animation.ValueAnimator;
public final class o9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39165a;
    public final u9 f39166b;

    public o9(u9 u9Var, int i10) {
        this.f39165a = i10;
        this.f39166b = u9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39165a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.f39166b;
                u9Var.X = floatValue;
                u9Var.f41005a.setAlpha(1.0f - floatValue);
                if (u9Var.V == 3) {
                    u9Var.f41007b.setAlpha(1.0f - u9Var.X);
                }
                u9Var.f41016r.setAlpha(1.0f - u9Var.X);
                u9Var.v = (u9Var.X * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                this.f39166b.f41016r.invalidate();
                return;
        }
    }
}
