package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.jh1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31838a;
    public final float f31839b;
    public final float f31840c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31838a = i10;
        this.e = obj;
        this.f31839b = f7;
        this.f31840c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31838a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31585y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f31839b * floatValue);
                l0Var.f31574r0 = this.f31840c * floatValue;
                l0Var.f31576s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                jh1 jh1Var = (jh1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jh1Var.f38187f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f31839b * floatValue2);
                jh1Var.Y0 = this.f31840c * floatValue2;
                jh1Var.Z0 = this.d * floatValue2;
                jh1Var.f38207s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f47099b;
                gVar.d = this.f31839b * floatValue3;
                gVar.e = this.f31840c * floatValue3;
                gVar.f47067i = floatValue3 * this.d;
                return;
        }
    }
}
