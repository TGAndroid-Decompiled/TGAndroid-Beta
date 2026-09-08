package org.telegram.ui;

import android.animation.ValueAnimator;
public final class o9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39164a;
    public final u9 f39165b;

    public o9(u9 u9Var, int i10) {
        this.f39164a = i10;
        this.f39165b = u9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39164a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.f39165b;
                u9Var.X = floatValue;
                u9Var.f41004a.setAlpha(1.0f - floatValue);
                if (u9Var.V == 3) {
                    u9Var.f41006b.setAlpha(1.0f - u9Var.X);
                }
                u9Var.f41015r.setAlpha(1.0f - u9Var.X);
                u9Var.v = (u9Var.X * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                this.f39165b.f41015r.invalidate();
                return;
        }
    }
}
