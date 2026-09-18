package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f29399a;
    public final u f29400b;

    public n(u uVar, int i10) {
        this.f29399a = i10;
        this.f29400b = uVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f29399a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u uVar = this.f29400b;
                uVar.f29537a0 = floatValue;
                uVar.f29539b0.setAlpha(floatValue);
                uVar.f29536a.invalidate();
                return;
            default:
                u uVar2 = this.f29400b;
                p pVar = uVar2.f29536a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !uVar2.K0) {
                    uVar2.f29567x0.setAlpha(1.0f);
                    uVar2.K0 = true;
                    pVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                uVar2.f29567x0.setRotationY(f7);
                pVar.d.setRotationY(f7);
                return;
        }
    }
}
