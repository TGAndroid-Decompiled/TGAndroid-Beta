package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39773a;
    public final u9 f39774b;

    public n9(u9 u9Var, int i10) {
        this.f39773a = i10;
        this.f39774b = u9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39773a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.f39774b;
                u9Var.Y = floatValue;
                u9Var.f41881b.setAlpha(1.0f - floatValue);
                if (u9Var.W == 3) {
                    u9Var.f41883c.setAlpha(1.0f - u9Var.Y);
                }
                u9Var.f41891s.setAlpha(1.0f - u9Var.Y);
                u9Var.f41893x = (u9Var.Y * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                this.f39774b.f41891s.invalidate();
                return;
        }
    }
}
