package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.u20;
import org.telegram.ui.x30;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f39606a;
    public final x f39607b;

    public t(x xVar, int i3) {
        this.f39606a = i3;
        this.f39607b = xVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f39606a) {
            case 0:
                x xVar = this.f39607b;
                xVar.getClass();
                xVar.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.invalidate();
                return;
            default:
                x xVar2 = this.f39607b;
                xVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar2.f39672c = floatValue;
                x30 x30Var = xVar2.f39683k0;
                x30Var.f51789r3.setAlpha(1.0f - floatValue);
                u20 u20Var = x30Var.G1;
                if (u20Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u20Var.setAlpha((1.0f - x30Var.S3.f39672c) * f10);
                x30Var.G1(x30Var.f51783q2);
                xVar2.l();
                return;
        }
    }
}
