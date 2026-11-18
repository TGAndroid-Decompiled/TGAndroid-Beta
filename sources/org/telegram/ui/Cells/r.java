package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f31685a;
    public final Object f31686b;

    public r(Object obj, int i7) {
        this.f31685a = i7;
        this.f31686b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f31685a) {
            case 0:
                s sVar = (s) this.f31686b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                d0 d0Var = (d0) this.f31686b;
                d0Var.getClass();
                d0Var.f30510w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f30491a.run();
                return;
            case 2:
                q1 q1Var = (q1) this.f31686b;
                q1Var.getClass();
                q1Var.M9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 3:
                h4 h4Var = (h4) this.f31686b;
                org.telegram.ui.Components.q9 q9Var = h4Var.f30762a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h4Var.I) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                q9Var.setScaleX(f10);
                q9Var.setScaleY(f10);
                if (!h4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.J = floatValue;
                h4Var.invalidate();
                return;
            case 4:
                m6 m6Var = (m6) this.f31686b;
                m6Var.getClass();
                m6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                return;
            case 5:
                o7 o7Var = (o7) this.f31686b;
                o7Var.getClass();
                o7Var.f31189j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 6:
                t7 t7Var = (t7) this.f31686b;
                t7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.f31989w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f31989w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                v9 v9Var = (v9) this.f31686b;
                v9Var.getClass();
                v9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.C.invalidate();
                return;
            default:
                y9 y9Var = (y9) ((org.telegram.ui.ActionBar.i1) this.f31686b).f29010b;
                ((z9) y9Var.f32475b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((z9) y9Var.f32475b).invalidate();
                return;
        }
    }
}
