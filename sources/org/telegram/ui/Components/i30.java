package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25478a;
    public final m30 f25479b;

    public i30(m30 m30Var, int i10) {
        this.f25478a = i10;
        this.f25479b = m30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25478a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m30 m30Var = this.f25479b;
                m30Var.f26903r.x = (int) floatValue;
                m30Var.h();
                k30 k30Var = m30Var.f26895a;
                if (k30Var.getParent() != null) {
                    m30Var.f26902n.updateViewLayout(k30Var, m30Var.f26903r);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m30 m30Var2 = this.f25479b;
                m30Var2.f26903r.y = (int) floatValue2;
                k30 k30Var2 = m30Var2.f26895a;
                if (k30Var2.getParent() != null) {
                    m30Var2.f26902n.updateViewLayout(k30Var2, m30Var2.f26903r);
                    return;
                }
                return;
        }
    }
}
