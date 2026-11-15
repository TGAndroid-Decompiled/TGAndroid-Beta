package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37798a;
    public final s10 f37799b;

    public o10(s10 s10Var, int i7) {
        this.f37798a = i7;
        this.f37799b = s10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37798a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s10 s10Var = this.f37799b;
                s10Var.f39156s.x = (int) floatValue;
                s10Var.i();
                q10 q10Var = s10Var.f39144a;
                if (q10Var.getParent() != null) {
                    s10Var.f39154n.updateViewLayout(q10Var, s10Var.f39156s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s10 s10Var2 = this.f37799b;
                s10Var2.f39156s.y = (int) floatValue2;
                q10 q10Var2 = s10Var2.f39144a;
                if (q10Var2.getParent() != null) {
                    s10Var2.f39154n.updateViewLayout(q10Var2, s10Var2.f39156s);
                    return;
                }
                return;
        }
    }
}
