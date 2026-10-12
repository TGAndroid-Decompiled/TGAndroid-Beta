package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.dj1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f30566a;
    public final float f30567b;
    public final float f30568c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f30566a = i10;
        this.e = obj;
        this.f30567b = f7;
        this.f30568c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30566a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f30312y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f30567b * floatValue);
                l0Var.f30301r0 = this.f30568c * floatValue;
                l0Var.f30303s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                dj1 dj1Var = (dj1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj1Var.f35289f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f30567b * floatValue2);
                dj1Var.Y0 = this.f30568c * floatValue2;
                dj1Var.Z0 = this.d * floatValue2;
                dj1Var.f35309s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f45740b;
                gVar.d = this.f30567b * floatValue3;
                gVar.e = this.f30568c * floatValue3;
                gVar.f45708i = floatValue3 * this.d;
                return;
        }
    }
}
