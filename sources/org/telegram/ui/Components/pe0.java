package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class pe0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38456a;
    public final re0 f38457b;

    public pe0(re0 re0Var, int i7) {
        this.f38456a = i7;
        this.f38457b = re0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38456a) {
            case 0:
                re0 re0Var = this.f38457b;
                re0Var.getClass();
                re0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0Var.invalidate();
                return;
            default:
                re0 re0Var2 = this.f38457b;
                re0Var2.getClass();
                re0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0Var2.invalidate();
                return;
        }
    }
}
