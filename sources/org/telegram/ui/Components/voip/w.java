package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.n40;
import org.telegram.ui.r50;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f34097a;
    public final l0 f34098b;

    public w(l0 l0Var, int i10) {
        this.f34097a = i10;
        this.f34098b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f9;
        switch (this.f34097a) {
            case 0:
                l0 l0Var = this.f34098b;
                l0Var.getClass();
                l0Var.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f34098b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.f33798c = floatValue;
                r50 r50Var = l0Var2.f33804f0;
                r50Var.f41956v1.setAlpha(1.0f - floatValue);
                n40 n40Var = r50Var.K;
                if (n40Var.getTag() != null) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                n40Var.setAlpha((1.0f - r50Var.W1.f33798c) * f9);
                r50Var.E1(r50Var.f41951u0);
                l0Var2.l();
                return;
        }
    }
}
