package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50150a;
    public final t9 f50151b;

    public n9(t9 t9Var, int i7) {
        this.f50150a = i7;
        this.f50151b = t9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50150a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.f50151b;
                t9Var.Z = floatValue;
                t9Var.f52264b.setAlpha(1.0f - floatValue);
                if (t9Var.X == 3) {
                    t9Var.f52266c.setAlpha(1.0f - t9Var.Z);
                }
                t9Var.f52276s.setAlpha(1.0f - t9Var.Z);
                t9Var.f52278x = (t9Var.Z * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                return;
            default:
                this.f50151b.f52276s.invalidate();
                return;
        }
    }
}
