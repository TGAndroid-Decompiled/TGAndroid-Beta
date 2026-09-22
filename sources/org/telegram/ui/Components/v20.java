package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28570a;
    public final z20 f28571b;

    public v20(z20 z20Var, int i10) {
        this.f28570a = i10;
        this.f28571b = z20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28570a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var = this.f28571b;
                z20Var.f30461r.x = (int) floatValue;
                z20Var.h();
                x20 x20Var = z20Var.f30453a;
                if (x20Var.getParent() != null) {
                    z20Var.f30460n.updateViewLayout(x20Var, z20Var.f30461r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var2 = this.f28571b;
                z20Var2.f30461r.y = (int) floatValue2;
                x20 x20Var2 = z20Var2.f30453a;
                if (x20Var2.getParent() != null) {
                    z20Var2.f30460n.updateViewLayout(x20Var2, z20Var2.f30461r);
                    return;
                }
                return;
        }
    }
}
