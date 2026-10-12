package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.xi1;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f32099a;
    public final float f32100b;
    public final float f32101c;
    public final float d;
    public final Object f32102e;

    public y(Object obj, float f7, float f10, float f11, int i10) {
        this.f32099a = i10;
        this.f32102e = obj;
        this.f32100b = f7;
        this.f32101c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32099a) {
            case 0:
                n0 n0Var = (n0) this.f32102e;
                n0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f31831y0 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue, 1.0f, this.f32100b * floatValue);
                n0Var.f31820r0 = this.f32101c * floatValue;
                n0Var.f31822s0 = this.d * floatValue;
                n0Var.invalidate();
                return;
            case 1:
                xi1 xi1Var = (xi1) this.f32102e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xi1Var.f43999f1 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue2, 1.0f, this.f32100b * floatValue2);
                xi1Var.Y0 = this.f32101c * floatValue2;
                xi1Var.Z0 = this.d * floatValue2;
                xi1Var.f44019s.invalidate();
                return;
            default:
                sg.n nVar = (sg.n) this.f32102e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = nVar.f48317b;
                gVar.d = this.f32100b * floatValue3;
                gVar.f48282e = this.f32101c * floatValue3;
                gVar.f48285i = floatValue3 * this.d;
                return;
        }
    }
}
