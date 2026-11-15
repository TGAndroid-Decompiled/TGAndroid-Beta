package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.a30;
import org.telegram.ui.c40;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40632a;
    public final l0 f40633b;

    public h0(l0 l0Var, int i7) {
        this.f40632a = i7;
        this.f40633b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f40632a) {
            case 0:
                l0 l0Var = this.f40633b;
                l0Var.getClass();
                l0Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f40633b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f40726c = floatValue;
                c40 c40Var = l0Var2.f40737k0;
                c40Var.f46001y3.setAlpha(1.0f - floatValue);
                a30 a30Var = c40Var.J1;
                if (a30Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a30Var.setAlpha((1.0f - c40Var.Z3.f40726c) * f10);
                c40Var.J1(c40Var.f45975t2);
                l0Var2.l();
                return;
        }
    }
}
