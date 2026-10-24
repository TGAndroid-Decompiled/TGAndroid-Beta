package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.nh1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31954a;
    public final float f31955b;
    public final float f31956c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31954a = i10;
        this.e = obj;
        this.f31955b = f7;
        this.f31956c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31954a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31701y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f31955b * floatValue);
                l0Var.f31690r0 = this.f31956c * floatValue;
                l0Var.f31692s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                nh1 nh1Var = (nh1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh1Var.f39841f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f31955b * floatValue2);
                nh1Var.Y0 = this.f31956c * floatValue2;
                nh1Var.Z0 = this.d * floatValue2;
                nh1Var.f39861s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f47546b;
                gVar.d = this.f31955b * floatValue3;
                gVar.e = this.f31956c * floatValue3;
                gVar.f47514i = floatValue3 * this.d;
                return;
        }
    }
}
