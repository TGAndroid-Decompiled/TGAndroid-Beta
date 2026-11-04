package org.telegram.ui;

import android.animation.ValueAnimator;
public final class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47229a;
    public final s9 f47230b;

    public l9(s9 s9Var, int i3) {
        this.f47229a = i3;
        this.f47230b = s9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47229a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9 s9Var = this.f47230b;
                s9Var.Z = floatValue;
                s9Var.f49424b.setAlpha(1.0f - floatValue);
                if (s9Var.X == 3) {
                    s9Var.f49426c.setAlpha(1.0f - s9Var.Z);
                }
                s9Var.f49436s.setAlpha(1.0f - s9Var.Z);
                s9Var.f49438x = (s9Var.Z * 0.25f) + 0.5f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                this.f47230b.f49436s.invalidate();
                return;
        }
    }
}
