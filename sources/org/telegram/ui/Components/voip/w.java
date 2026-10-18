package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.jh1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31845a;
    public final float f31846b;
    public final float f31847c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31845a = i10;
        this.e = obj;
        this.f31846b = f7;
        this.f31847c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31845a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31592y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f31846b * floatValue);
                l0Var.f31581r0 = this.f31847c * floatValue;
                l0Var.f31583s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                jh1 jh1Var = (jh1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jh1Var.f38203f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f31846b * floatValue2);
                jh1Var.Y0 = this.f31847c * floatValue2;
                jh1Var.Z0 = this.d * floatValue2;
                jh1Var.f38223s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f47149b;
                gVar.d = this.f31846b * floatValue3;
                gVar.e = this.f31847c * floatValue3;
                gVar.f47117i = floatValue3 * this.d;
                return;
        }
    }
}
