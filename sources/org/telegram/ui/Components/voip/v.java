package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.o40;
import org.telegram.ui.s50;

public final class v implements ValueAnimator.AnimatorUpdateListener {

    public final int f33946a;

    public final k0 f33947b;

    public v(k0 k0Var, int i10) {
        this.f33946a = i10;
        this.f33947b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33946a) {
            case 0:
                k0 k0Var = this.f33947b;
                k0Var.getClass();
                k0Var.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.f33947b;
                k0Var2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f33650c = fFloatValue;
                s50 s50Var = k0Var2.f33656f0;
                s50Var.f42498v1.setAlpha(1.0f - fFloatValue);
                o40 o40Var = s50Var.K;
                o40Var.setAlpha((1.0f - s50Var.W1.f33650c) * (o40Var.getTag() != null ? 1.0f : 0.0f));
                s50Var.E1(s50Var.f42493u0);
                k0Var2.l();
                break;
        }
    }
}
