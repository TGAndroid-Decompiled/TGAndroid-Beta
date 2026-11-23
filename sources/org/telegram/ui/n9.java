package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50154a;
    public final t9 f50155b;

    public n9(t9 t9Var, int i7) {
        this.f50154a = i7;
        this.f50155b = t9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50154a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.f50155b;
                t9Var.Z = floatValue;
                t9Var.f52268b.setAlpha(1.0f - floatValue);
                if (t9Var.X == 3) {
                    t9Var.f52270c.setAlpha(1.0f - t9Var.Z);
                }
                t9Var.f52280s.setAlpha(1.0f - t9Var.Z);
                t9Var.f52282x = (t9Var.Z * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                return;
            default:
                this.f50155b.f52280s.invalidate();
                return;
        }
    }
}
