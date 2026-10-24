package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24886a;
    public final g30 f24887b;

    public b30(g30 g30Var, int i10) {
        this.f24886a = i10;
        this.f24887b = g30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24886a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g30 g30Var = this.f24887b;
                g30Var.f26545r.x = (int) floatValue;
                g30Var.h();
                d30 d30Var = g30Var.f26537a;
                if (d30Var.getParent() != null) {
                    g30Var.f26544n.updateViewLayout(d30Var, g30Var.f26545r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g30 g30Var2 = this.f24887b;
                g30Var2.f26545r.y = (int) floatValue2;
                d30 d30Var2 = g30Var2.f26537a;
                if (d30Var2.getParent() != null) {
                    g30Var2.f26544n.updateViewLayout(d30Var2, g30Var2.f26545r);
                    return;
                }
                return;
        }
    }
}
