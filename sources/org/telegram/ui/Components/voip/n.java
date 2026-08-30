package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f29784a;
    public final t f29785b;

    public n(t tVar, int i10) {
        this.f29784a = i10;
        this.f29785b = tVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4;
        switch (this.f29784a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.f29785b;
                tVar.U = floatValue;
                tVar.V.setAlpha(floatValue);
                tVar.f29919a.invalidate();
                return;
            default:
                t tVar2 = this.f29785b;
                o oVar = tVar2.f29919a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z4 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z4 = true;
                }
                if (z4 && !tVar2.H0) {
                    tVar2.f29945u0.setAlpha(1.0f);
                    tVar2.H0 = true;
                    oVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                tVar2.f29945u0.setRotationY(f10);
                oVar.d.setRotationY(f10);
                return;
        }
    }
}
