package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47862a;
    public final s9 f47863b;

    public m9(s9 s9Var, int i7) {
        this.f47862a = i7;
        this.f47863b = s9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47862a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9 s9Var = this.f47863b;
                s9Var.Y = floatValue;
                s9Var.f49740b.setAlpha(1.0f - floatValue);
                if (s9Var.W == 3) {
                    s9Var.f49742c.setAlpha(1.0f - s9Var.Y);
                }
                s9Var.f49751s.setAlpha(1.0f - s9Var.Y);
                s9Var.f49753x = (s9Var.Y * 0.25f) + 0.5f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                this.f47863b.f49751s.invalidate();
                return;
        }
    }
}
