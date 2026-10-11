package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39838a;
    public final u9 f39839b;

    public m9(u9 u9Var, int i10) {
        this.f39838a = i10;
        this.f39839b = u9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39838a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.f39839b;
                u9Var.Z = floatValue;
                u9Var.f42411a.setAlpha(1.0f - floatValue);
                if (u9Var.X == 3) {
                    u9Var.f42413b.setAlpha(1.0f - u9Var.Z);
                }
                u9Var.f42425s.setAlpha(1.0f - u9Var.Z);
                u9Var.f42426w = (u9Var.Z * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                this.f39839b.f42425s.invalidate();
                return;
        }
    }
}
