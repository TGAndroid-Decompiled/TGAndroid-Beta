package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class h10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34258a;
    public final l10 f34259b;

    public h10(l10 l10Var, int i3) {
        this.f34258a = i3;
        this.f34259b = l10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34258a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l10 l10Var = this.f34259b;
                l10Var.f35557r.x = (int) floatValue;
                l10Var.h();
                j10 j10Var = l10Var.f35547a;
                if (j10Var.getParent() != null) {
                    l10Var.f35556n.updateViewLayout(j10Var, l10Var.f35557r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l10 l10Var2 = this.f34259b;
                l10Var2.f35557r.y = (int) floatValue2;
                j10 j10Var2 = l10Var2.f35547a;
                if (j10Var2.getParent() != null) {
                    l10Var2.f35556n.updateViewLayout(j10Var2, l10Var2.f35557r);
                    return;
                }
                return;
        }
    }
}
