package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31931a;
    public final float f31932b;
    public final float f31933c;
    public final float d;
    public final Object f31934e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31931a = i10;
        this.f31934e = obj;
        this.f31932b = f7;
        this.f31933c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31931a) {
            case 0:
                l0 l0Var = (l0) this.f31934e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31657y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f31932b * floatValue);
                l0Var.f31646r0 = this.f31933c * floatValue;
                l0Var.f31648s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ui1 ui1Var = (ui1) this.f31934e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f41151f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f31932b * floatValue2);
                ui1Var.Y0 = this.f31933c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.f41171s.invalidate();
                return;
            default:
                tg.e eVar = (tg.e) this.f31934e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.a aVar = eVar.f46548b;
                aVar.d = this.f31932b * floatValue3;
                aVar.f46520e = this.f31933c * floatValue3;
                aVar.f46522g = floatValue3 * this.d;
                return;
        }
    }
}
