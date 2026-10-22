package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.hh1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31802a;
    public final float f31803b;
    public final float f31804c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31802a = i10;
        this.e = obj;
        this.f31803b = f7;
        this.f31804c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31802a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31549y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f31803b * floatValue);
                l0Var.f31538r0 = this.f31804c * floatValue;
                l0Var.f31540s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                hh1 hh1Var = (hh1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh1Var.f37649f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f31803b * floatValue2);
                hh1Var.Y0 = this.f31804c * floatValue2;
                hh1Var.Z0 = this.d * floatValue2;
                hh1Var.f37669s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f47111b;
                gVar.d = this.f31803b * floatValue3;
                gVar.e = this.f31804c * floatValue3;
                gVar.f47079i = floatValue3 * this.d;
                return;
        }
    }
}
