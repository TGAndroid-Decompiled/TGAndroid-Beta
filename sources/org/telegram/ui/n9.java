package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40105a;
    public final v9 f40106b;

    public n9(v9 v9Var, int i10) {
        this.f40105a = i10;
        this.f40106b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40105a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = this.f40106b;
                v9Var.Z = floatValue;
                v9Var.f42711a.setAlpha(1.0f - floatValue);
                if (v9Var.X == 3) {
                    v9Var.f42713b.setAlpha(1.0f - v9Var.Z);
                }
                v9Var.f42725s.setAlpha(1.0f - v9Var.Z);
                v9Var.f42726w = (v9Var.Z * 0.25f) + 0.5f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                this.f40106b.f42725s.invalidate();
                return;
        }
    }
}
