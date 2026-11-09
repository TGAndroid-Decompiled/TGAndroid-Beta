package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f30172a;
    public final Object f30173b;

    public r(Object obj, int i7) {
        this.f30172a = i7;
        this.f30173b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f30172a) {
            case 0:
                s sVar = (s) this.f30173b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                c0 c0Var = (c0) this.f30173b;
                c0Var.getClass();
                c0Var.f28974w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.f28955a.run();
                return;
            case 2:
                q1 q1Var = (q1) this.f30173b;
                q1Var.getClass();
                q1Var.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 3:
                h4 h4Var = (h4) this.f30173b;
                org.telegram.ui.Components.l9 l9Var = h4Var.f29266a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h4Var.H) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                l9Var.setScaleX(f10);
                l9Var.setScaleY(f10);
                if (!h4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.I = floatValue;
                h4Var.invalidate();
                return;
            case 4:
                m6 m6Var = (m6) this.f30173b;
                m6Var.getClass();
                m6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                return;
            case 5:
                o7 o7Var = (o7) this.f30173b;
                o7Var.getClass();
                o7Var.f29677i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 6:
                t7 t7Var = (t7) this.f30173b;
                t7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.f30540w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f30540w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                v9 v9Var = (v9) this.f30173b;
                v9Var.getClass();
                v9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.C.invalidate();
                return;
            default:
                x9 x9Var = (x9) ((org.telegram.ui.ActionBar.h1) this.f30173b).f27506b;
                ((y9) x9Var.f30916b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((y9) x9Var.f30916b).invalidate();
                return;
        }
    }
}
