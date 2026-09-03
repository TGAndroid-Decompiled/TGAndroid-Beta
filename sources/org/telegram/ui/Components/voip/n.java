package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f32202a;
    public final u f32203b;

    public n(u uVar, int i10) {
        this.f32202a = i10;
        this.f32203b = uVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4;
        switch (this.f32202a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u uVar = this.f32203b;
                uVar.U = floatValue;
                uVar.V.setAlpha(floatValue);
                uVar.f32365a.invalidate();
                return;
            default:
                u uVar2 = this.f32203b;
                p pVar = uVar2.f32365a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z4 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z4 = true;
                }
                if (z4 && !uVar2.H0) {
                    uVar2.f32392u0.setAlpha(1.0f);
                    uVar2.H0 = true;
                    pVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                uVar2.f32392u0.setRotationY(f10);
                pVar.d.setRotationY(f10);
                return;
        }
    }
}
