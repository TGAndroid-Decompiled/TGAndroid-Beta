package org.telegram.ui;

import android.animation.ValueAnimator;
public final class p9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36499a;
    public final v9 f36500b;

    public p9(v9 v9Var, int i10) {
        this.f36499a = i10;
        this.f36500b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36499a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = this.f36500b;
                v9Var.X = floatValue;
                v9Var.f38437a.setAlpha(1.0f - floatValue);
                if (v9Var.V == 3) {
                    v9Var.f38439b.setAlpha(1.0f - v9Var.X);
                }
                v9Var.f38447r.setAlpha(1.0f - v9Var.X);
                v9Var.v = (v9Var.X * 0.25f) + 0.5f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                this.f36500b.f38447r.invalidate();
                return;
        }
    }
}
