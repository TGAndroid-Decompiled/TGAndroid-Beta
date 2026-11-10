package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c30;
import org.telegram.ui.f40;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39224a;
    public final k0 f39225b;

    public g0(k0 k0Var, int i7) {
        this.f39224a = i7;
        this.f39225b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f39224a) {
            case 0:
                k0 k0Var = this.f39225b;
                k0Var.getClass();
                k0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f39225b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f39304c = floatValue;
                f40 f40Var = k0Var2.f39314j0;
                f40Var.f45584t3.setAlpha(1.0f - floatValue);
                c30 c30Var = f40Var.I1;
                if (c30Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                c30Var.setAlpha((1.0f - f40Var.U3.f39304c) * f10);
                f40Var.J1(f40Var.f45579s2);
                k0Var2.l();
                return;
        }
    }
}
