package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39872a;
    public final u9 f39873b;

    public m9(u9 u9Var, int i10) {
        this.f39872a = i10;
        this.f39873b = u9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39872a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.f39873b;
                u9Var.Z = floatValue;
                u9Var.f42445a.setAlpha(1.0f - floatValue);
                if (u9Var.X == 3) {
                    u9Var.f42447b.setAlpha(1.0f - u9Var.Z);
                }
                u9Var.f42459s.setAlpha(1.0f - u9Var.Z);
                u9Var.f42460w = (u9Var.Z * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                this.f39873b.f42459s.invalidate();
                return;
        }
    }
}
