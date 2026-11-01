package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.a50;
import org.telegram.ui.x30;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f31720a;
    public final x f31721b;

    public t(x xVar, int i10) {
        this.f31720a = i10;
        this.f31721b = xVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31720a) {
            case 0:
                x xVar = this.f31721b;
                xVar.getClass();
                xVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.invalidate();
                return;
            default:
                x xVar2 = this.f31721b;
                xVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar2.f31794c = floatValue;
                a50 a50Var = xVar2.f31803j0;
                a50Var.f35649q3.setAlpha(1.0f - floatValue);
                x30 x30Var = a50Var.F1;
                if (x30Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                x30Var.setAlpha((1.0f - a50Var.R3.f31794c) * f7);
                a50Var.G1(a50Var.f35644p2);
                xVar2.l();
                return;
        }
    }
}
