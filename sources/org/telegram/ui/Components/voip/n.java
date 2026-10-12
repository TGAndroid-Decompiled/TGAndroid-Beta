package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f31795a;
    public final v f31796b;

    public n(v vVar, int i10) {
        this.f31795a = i10;
        this.f31796b = vVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f31795a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v vVar = this.f31796b;
                vVar.f31997a0 = floatValue;
                vVar.f31999b0.setAlpha(floatValue);
                vVar.f31996a.invalidate();
                return;
            default:
                v vVar2 = this.f31796b;
                q qVar = vVar2.f31996a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !vVar2.K0) {
                    vVar2.f32028x0.setAlpha(1.0f);
                    vVar2.K0 = true;
                    qVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                vVar2.f32028x0.setRotationY(f7);
                qVar.d.setRotationY(f7);
                return;
        }
    }
}
