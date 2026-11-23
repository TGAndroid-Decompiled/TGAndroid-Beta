package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f31397a;
    public final Object f31398b;

    public r(Object obj, int i7) {
        this.f31397a = i7;
        this.f31398b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f31397a) {
            case 0:
                s sVar = (s) this.f31398b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                d0 d0Var = (d0) this.f31398b;
                d0Var.getClass();
                d0Var.f30603w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f30584a.run();
                return;
            case 2:
                r1 r1Var = (r1) this.f31398b;
                r1Var.getClass();
                r1Var.M9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 3:
                i4 i4Var = (i4) this.f31398b;
                org.telegram.ui.Components.p9 p9Var = i4Var.f30897a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i4Var.I) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                p9Var.setScaleX(f10);
                p9Var.setScaleY(f10);
                if (!i4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                i4Var.J = floatValue;
                i4Var.invalidate();
                return;
            case 4:
                m6 m6Var = (m6) this.f31398b;
                m6Var.getClass();
                m6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                return;
            case 5:
                o7 o7Var = (o7) this.f31398b;
                o7Var.getClass();
                o7Var.f31273j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 6:
                t7 t7Var = (t7) this.f31398b;
                t7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.f31937w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f31937w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                v9 v9Var = (v9) this.f31398b;
                v9Var.getClass();
                v9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.C.invalidate();
                return;
            default:
                y9 y9Var = (y9) ((org.telegram.ui.ActionBar.h1) this.f31398b).f29053b;
                ((z9) y9Var.f32576b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((z9) y9Var.f32576b).invalidate();
                return;
        }
    }
}
