package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49186a;
    public final t9 f49187b;

    public m9(t9 t9Var, int i7) {
        this.f49186a = i7;
        this.f49187b = t9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49186a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.f49187b;
                t9Var.Z = floatValue;
                t9Var.f51494b.setAlpha(1.0f - floatValue);
                if (t9Var.X == 3) {
                    t9Var.f51496c.setAlpha(1.0f - t9Var.Z);
                }
                t9Var.f51506s.setAlpha(1.0f - t9Var.Z);
                t9Var.f51508x = (t9Var.Z * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                return;
            default:
                this.f49187b.f51506s.invalidate();
                return;
        }
    }
}
