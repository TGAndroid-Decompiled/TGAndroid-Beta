package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class c20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24957a;
    public final g20 f24958b;

    public c20(g20 g20Var, int i10) {
        this.f24957a = i10;
        this.f24958b = g20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24957a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g20 g20Var = this.f24958b;
                g20Var.f26234r.x = (int) floatValue;
                g20Var.h();
                e20 e20Var = g20Var.f26226a;
                if (e20Var.getParent() != null) {
                    g20Var.f26233n.updateViewLayout(e20Var, g20Var.f26234r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g20 g20Var2 = this.f24958b;
                g20Var2.f26234r.y = (int) floatValue2;
                e20 e20Var2 = g20Var2.f26226a;
                if (e20Var2.getParent() != null) {
                    g20Var2.f26233n.updateViewLayout(e20Var2, g20Var2.f26234r);
                    return;
                }
                return;
        }
    }
}
