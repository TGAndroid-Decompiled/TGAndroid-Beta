package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f31313a;
    public final Object f31314b;

    public r(Object obj, int i7) {
        this.f31313a = i7;
        this.f31314b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f31313a) {
            case 0:
                s sVar = (s) this.f31314b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                d0 d0Var = (d0) this.f31314b;
                d0Var.getClass();
                d0Var.f30514w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f30495a.run();
                return;
            case 2:
                r1 r1Var = (r1) this.f31314b;
                r1Var.getClass();
                r1Var.M9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 3:
                i4 i4Var = (i4) this.f31314b;
                org.telegram.ui.Components.q9 q9Var = i4Var.f30807a;
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
                n6 n6Var = (n6) this.f31314b;
                n6Var.getClass();
                n6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 5:
                p7 p7Var = (p7) this.f31314b;
                p7Var.getClass();
                p7Var.f31233j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 6:
                u7 u7Var = (u7) this.f31314b;
                u7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.f32034w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - u7Var.f32034w) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                w9 w9Var = (w9) this.f31314b;
                w9Var.getClass();
                w9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.C.invalidate();
                return;
            default:
                z9 z9Var = (z9) ((org.telegram.ui.ActionBar.h1) this.f31314b).f28961b;
                ((aa) z9Var.f32523b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((aa) z9Var.f32523b).invalidate();
                return;
        }
    }
}
