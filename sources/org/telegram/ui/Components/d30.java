package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25402a;
    public final i30 f25403b;

    public d30(i30 i30Var, int i10) {
        this.f25402a = i10;
        this.f25403b = i30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25402a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30 i30Var = this.f25403b;
                i30Var.f27060r.x = (int) floatValue;
                i30Var.h();
                f30 f30Var = i30Var.f27052a;
                if (f30Var.getParent() != null) {
                    i30Var.f27059n.updateViewLayout(f30Var, i30Var.f27060r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30 i30Var2 = this.f25403b;
                i30Var2.f27060r.y = (int) floatValue2;
                f30 f30Var2 = i30Var2.f27052a;
                if (f30Var2.getParent() != null) {
                    i30Var2.f27059n.updateViewLayout(f30Var2, i30Var2.f27060r);
                    return;
                }
                return;
        }
    }
}
