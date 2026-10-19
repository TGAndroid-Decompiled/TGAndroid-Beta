package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.hh1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31847a;
    public final float f31848b;
    public final float f31849c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31847a = i10;
        this.e = obj;
        this.f31848b = f7;
        this.f31849c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31847a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31594y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f31848b * floatValue);
                l0Var.f31583r0 = this.f31849c * floatValue;
                l0Var.f31585s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                hh1 hh1Var = (hh1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh1Var.f37639f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f31848b * floatValue2);
                hh1Var.Y0 = this.f31849c * floatValue2;
                hh1Var.Z0 = this.d * floatValue2;
                hh1Var.f37659s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f47103b;
                gVar.d = this.f31848b * floatValue3;
                gVar.e = this.f31849c * floatValue3;
                gVar.f47071i = floatValue3 * this.d;
                return;
        }
    }
}
