package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f33860a;
    public final u f33861b;

    public n(u uVar, int i10) {
        this.f33860a = i10;
        this.f33861b = uVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f33860a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u uVar = this.f33861b;
                uVar.T = floatValue;
                uVar.U.setAlpha(floatValue);
                uVar.f34014a.invalidate();
                return;
            default:
                u uVar2 = this.f33861b;
                p pVar = uVar2.f34014a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !uVar2.G0) {
                    uVar2.f34040t0.setAlpha(1.0f);
                    uVar2.G0 = true;
                    pVar.d.clearImage();
                }
                float f9 = floatValue2 * 180.0f;
                uVar2.f34040t0.setRotationY(f9);
                pVar.d.setRotationY(f9);
                return;
        }
    }
}
