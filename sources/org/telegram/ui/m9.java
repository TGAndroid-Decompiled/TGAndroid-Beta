package org.telegram.ui;

import android.animation.ValueAnimator;
public final class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49182a;
    public final t9 f49183b;

    public m9(t9 t9Var, int i7) {
        this.f49182a = i7;
        this.f49183b = t9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49182a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.f49183b;
                t9Var.Z = floatValue;
                t9Var.f51495b.setAlpha(1.0f - floatValue);
                if (t9Var.X == 3) {
                    t9Var.f51497c.setAlpha(1.0f - t9Var.Z);
                }
                t9Var.f51507s.setAlpha(1.0f - t9Var.Z);
                t9Var.f51509x = (t9Var.Z * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                return;
            default:
                this.f49183b.f51507s.invalidate();
                return;
        }
    }
}
