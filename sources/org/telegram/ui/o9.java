package org.telegram.ui;

import android.animation.ValueAnimator;
public final class o9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36082a;
    public final u9 f36083b;

    public o9(u9 u9Var, int i10) {
        this.f36082a = i10;
        this.f36083b = u9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36082a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.f36083b;
                u9Var.X = floatValue;
                u9Var.f38354a.setAlpha(1.0f - floatValue);
                if (u9Var.V == 3) {
                    u9Var.f38356b.setAlpha(1.0f - u9Var.X);
                }
                u9Var.f38364r.setAlpha(1.0f - u9Var.X);
                u9Var.v = (u9Var.X * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                this.f36083b.f38364r.invalidate();
                return;
        }
    }
}
