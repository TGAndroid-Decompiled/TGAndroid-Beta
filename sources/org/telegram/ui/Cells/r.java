package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f31316a;
    public final Object f31317b;

    public r(Object obj, int i7) {
        this.f31316a = i7;
        this.f31317b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f31316a) {
            case 0:
                s sVar = (s) this.f31317b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                d0 d0Var = (d0) this.f31317b;
                d0Var.getClass();
                d0Var.f30517w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f30498a.run();
                return;
            case 2:
                r1 r1Var = (r1) this.f31317b;
                r1Var.getClass();
                r1Var.M9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 3:
                i4 i4Var = (i4) this.f31317b;
                org.telegram.ui.Components.q9 q9Var = i4Var.f30810a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i4Var.I) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                q9Var.setScaleX(f10);
                q9Var.setScaleY(f10);
                if (!i4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                i4Var.J = floatValue;
                i4Var.invalidate();
                return;
            case 4:
                n6 n6Var = (n6) this.f31317b;
                n6Var.getClass();
                n6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 5:
                p7 p7Var = (p7) this.f31317b;
                p7Var.getClass();
                p7Var.f31236j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 6:
                u7 u7Var = (u7) this.f31317b;
                u7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.f32037w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - u7Var.f32037w) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                w9 w9Var = (w9) this.f31317b;
                w9Var.getClass();
                w9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.C.invalidate();
                return;
            default:
                z9 z9Var = (z9) ((org.telegram.ui.ActionBar.i1) this.f31317b).f29008b;
                ((aa) z9Var.f32526b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((aa) z9Var.f32526b).invalidate();
                return;
        }
    }
}
