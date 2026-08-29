package org.telegram.ui;

import android.animation.ValueAnimator;
public final class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40123a;
    public final r9 f40124b;

    public l9(r9 r9Var, int i10) {
        this.f40123a = i10;
        this.f40124b = r9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40123a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var = this.f40124b;
                r9Var.T = floatValue;
                r9Var.f42000a.setAlpha(1.0f - floatValue);
                if (r9Var.R == 3) {
                    r9Var.f42002b.setAlpha(1.0f - r9Var.T);
                }
                r9Var.f42007r.setAlpha(1.0f - r9Var.T);
                r9Var.v = (r9Var.T * 0.25f) + 0.5f;
                r9Var.fragmentView.invalidate();
                return;
            default:
                this.f40124b.f42007r.invalidate();
                return;
        }
    }
}
