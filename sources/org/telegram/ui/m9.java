package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40354a;
    public final s9 f40355b;

    public m9(s9 s9Var, int i9) {
        this.f40354a = i9;
        this.f40355b = s9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40354a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9 s9Var = this.f40355b;
                s9Var.T = floatValue;
                s9Var.f42593a.setAlpha(1.0f - floatValue);
                if (s9Var.R == 3) {
                    s9Var.f42595b.setAlpha(1.0f - s9Var.T);
                }
                s9Var.f42600r.setAlpha(1.0f - s9Var.T);
                s9Var.v = (s9Var.T * 0.25f) + 0.5f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                this.f40355b.f42600r.invalidate();
                return;
        }
    }
}
