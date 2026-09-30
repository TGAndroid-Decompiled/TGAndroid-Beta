package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30871a;
    public final d30 f30872b;

    public z20(d30 d30Var, int i10) {
        this.f30871a = i10;
        this.f30872b = d30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30871a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var = this.f30872b;
                d30Var.f23507r.x = (int) floatValue;
                d30Var.h();
                b30 b30Var = d30Var.f23499a;
                if (b30Var.getParent() != null) {
                    d30Var.f23506n.updateViewLayout(b30Var, d30Var.f23507r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var2 = this.f30872b;
                d30Var2.f23507r.y = (int) floatValue2;
                b30 b30Var2 = d30Var2.f23499a;
                if (b30Var2.getParent() != null) {
                    d30Var2.f23506n.updateViewLayout(b30Var2, d30Var2.f23507r);
                    return;
                }
                return;
        }
    }
}
