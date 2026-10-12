package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.xi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32096a;
    public final float f32097b;
    public final float f32098c;
    public final float d;
    public final Object f32099e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f32096a = i10;
        this.f32099e = obj;
        this.f32097b = f7;
        this.f32098c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32096a) {
            case 0:
                n0 n0Var = (n0) this.f32099e;
                n0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f31846y0 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue, 1.0f, this.f32097b * floatValue);
                n0Var.f31835r0 = this.f32098c * floatValue;
                n0Var.f31837s0 = this.d * floatValue;
                n0Var.invalidate();
                return;
            case 1:
                xi1 xi1Var = (xi1) this.f32099e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xi1Var.f43994f1 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue2, 1.0f, this.f32097b * floatValue2);
                xi1Var.Y0 = this.f32098c * floatValue2;
                xi1Var.Z0 = this.d * floatValue2;
                xi1Var.f44014s.invalidate();
                return;
            default:
                sg.n nVar = (sg.n) this.f32099e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = nVar.f48309b;
                gVar.d = this.f32097b * floatValue3;
                gVar.f48274e = this.f32098c * floatValue3;
                gVar.f48277i = floatValue3 * this.d;
                return;
        }
    }
}
