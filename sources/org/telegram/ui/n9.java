package org.telegram.ui;

import android.animation.ValueAnimator;
public final class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40103a;
    public final v9 f40104b;

    public n9(v9 v9Var, int i10) {
        this.f40103a = i10;
        this.f40104b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40103a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = this.f40104b;
                v9Var.Z = floatValue;
                v9Var.f42709a.setAlpha(1.0f - floatValue);
                if (v9Var.X == 3) {
                    v9Var.f42711b.setAlpha(1.0f - v9Var.Z);
                }
                v9Var.f42723s.setAlpha(1.0f - v9Var.Z);
                v9Var.f42724w = (v9Var.Z * 0.25f) + 0.5f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                this.f40104b.f42723s.invalidate();
                return;
        }
    }
}
