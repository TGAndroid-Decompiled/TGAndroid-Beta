package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.m40;
import org.telegram.ui.q50;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f31777a;
    public final l0 f31778b;

    public v(l0 l0Var, int i10) {
        this.f31777a = i10;
        this.f31778b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31777a) {
            case 0:
                l0 l0Var = this.f31778b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31778b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f31516c = floatValue;
                q50 q50Var = l0Var2.f31525j0;
                q50Var.f40481z1.setAlpha(1.0f - floatValue);
                m40 m40Var = q50Var.O;
                if (m40Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                m40Var.setAlpha((1.0f - q50Var.a2.f31516c) * f7);
                q50Var.F1(q50Var.f40477y0);
                l0Var2.l();
                return;
        }
    }
}
