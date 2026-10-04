package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38346a;
    public final uv0 f38347b;

    public lv0(uv0 uv0Var, int i10) {
        this.f38346a = i10;
        this.f38347b = uv0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38346a) {
            case 0:
                uv0 uv0Var = this.f38347b;
                uv0Var.getClass();
                uv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uv0 uv0Var2 = this.f38347b;
                uv0Var2.getClass();
                uv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
