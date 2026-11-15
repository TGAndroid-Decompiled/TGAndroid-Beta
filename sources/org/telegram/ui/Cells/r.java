package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f31321a;
    public final Object f31322b;

    public r(Object obj, int i7) {
        this.f31321a = i7;
        this.f31322b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f31321a) {
            case 0:
                s sVar = (s) this.f31322b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                c0 c0Var = (c0) this.f31322b;
                c0Var.getClass();
                c0Var.f30081w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.f30062a.run();
                return;
            case 2:
                q1 q1Var = (q1) this.f31322b;
                q1Var.getClass();
                q1Var.M9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 3:
                h4 h4Var = (h4) this.f31322b;
                org.telegram.ui.Components.i9 i9Var = h4Var.f30385a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h4Var.I) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                i9Var.setScaleX(f10);
                i9Var.setScaleY(f10);
                if (!h4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.J = floatValue;
                h4Var.invalidate();
                return;
            case 4:
                l6 l6Var = (l6) this.f31322b;
                l6Var.getClass();
                l6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                return;
            case 5:
                n7 n7Var = (n7) this.f31322b;
                n7Var.getClass();
                n7Var.f30754j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                return;
            case 6:
                s7 s7Var = (s7) this.f31322b;
                s7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.f31426w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - s7Var.f31426w) * (-0.3f));
                }
                s7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                u9 u9Var = (u9) this.f31322b;
                u9Var.getClass();
                u9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.C.invalidate();
                return;
            default:
                x9 x9Var = (x9) ((org.telegram.ui.ActionBar.h1) this.f31322b).f28631b;
                ((y9) x9Var.f32048b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((y9) x9Var.f32048b).invalidate();
                return;
        }
    }
}
