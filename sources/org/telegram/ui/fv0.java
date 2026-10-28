package org.telegram.ui;

import android.animation.ValueAnimator;
public final class fv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39433a;
    public final ov0 f39434b;

    public fv0(ov0 ov0Var, int i10) {
        this.f39433a = i10;
        this.f39434b = ov0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39433a) {
            case 0:
                ov0 ov0Var = this.f39434b;
                ov0Var.getClass();
                ov0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ov0 ov0Var2 = this.f39434b;
                ov0Var2.getClass();
                ov0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
