package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b50;
import org.telegram.ui.y30;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f31661a;
    public final w f31662b;

    public t(w wVar, int i10) {
        this.f31661a = i10;
        this.f31662b = wVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f31661a) {
            case 0:
                w wVar = this.f31662b;
                wVar.getClass();
                wVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                return;
            default:
                w wVar2 = this.f31662b;
                wVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar2.f31714c = floatValue;
                b50 b50Var = wVar2.f31723j0;
                b50Var.f36065q3.setAlpha(1.0f - floatValue);
                y30 y30Var = b50Var.F1;
                if (y30Var.getTag() != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                y30Var.setAlpha((1.0f - b50Var.R3.f31714c) * f7);
                b50Var.G1(b50Var.f36060p2);
                wVar2.l();
                return;
        }
    }
}
