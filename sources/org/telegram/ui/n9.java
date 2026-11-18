package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50131a;
    public final t9 f50132b;

    public n9(t9 t9Var, int i7) {
        this.f50131a = i7;
        this.f50132b = t9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50131a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.f50132b;
                t9Var.Z = floatValue;
                t9Var.f52209b.setAlpha(1.0f - floatValue);
                if (t9Var.X == 3) {
                    t9Var.f52211c.setAlpha(1.0f - t9Var.Z);
                }
                t9Var.f52221s.setAlpha(1.0f - t9Var.Z);
                t9Var.f52223x = (t9Var.Z * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                return;
            default:
                this.f50132b.f52221s.invalidate();
                return;
        }
    }
}
