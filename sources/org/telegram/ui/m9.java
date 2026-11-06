package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47736a;
    public final s9 f47737b;

    public m9(s9 s9Var, int i7) {
        this.f47736a = i7;
        this.f47737b = s9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47736a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9 s9Var = this.f47737b;
                s9Var.Y = floatValue;
                s9Var.f49687b.setAlpha(1.0f - floatValue);
                if (s9Var.W == 3) {
                    s9Var.f49689c.setAlpha(1.0f - s9Var.Y);
                }
                s9Var.f49698s.setAlpha(1.0f - s9Var.Y);
                s9Var.f49700x = (s9Var.Y * 0.25f) + 0.5f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                this.f47737b.f49698s.invalidate();
                return;
        }
    }
}
