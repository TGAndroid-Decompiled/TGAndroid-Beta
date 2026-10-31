package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39878a;
    public final u9 f39879b;

    public n9(u9 u9Var, int i10) {
        this.f39878a = i10;
        this.f39879b = u9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39878a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.f39879b;
                u9Var.Y = floatValue;
                u9Var.f42079b.setAlpha(1.0f - floatValue);
                if (u9Var.W == 3) {
                    u9Var.f42081c.setAlpha(1.0f - u9Var.Y);
                }
                u9Var.f42089s.setAlpha(1.0f - u9Var.Y);
                u9Var.f42091x = (u9Var.Y * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                this.f39879b.f42089s.invalidate();
                return;
        }
    }
}
