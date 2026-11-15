package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37787a;
    public final s10 f37788b;

    public o10(s10 s10Var, int i7) {
        this.f37787a = i7;
        this.f37788b = s10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37787a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s10 s10Var = this.f37788b;
                s10Var.f39153s.x = (int) floatValue;
                s10Var.i();
                q10 q10Var = s10Var.f39141a;
                if (q10Var.getParent() != null) {
                    s10Var.f39151n.updateViewLayout(q10Var, s10Var.f39153s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s10 s10Var2 = this.f37788b;
                s10Var2.f39153s.y = (int) floatValue2;
                q10 q10Var2 = s10Var2.f39141a;
                if (q10Var2.getParent() != null) {
                    s10Var2.f39151n.updateViewLayout(q10Var2, s10Var2.f39153s);
                    return;
                }
                return;
        }
    }
}
