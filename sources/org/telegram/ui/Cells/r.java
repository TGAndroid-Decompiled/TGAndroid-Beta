package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f30245a;
    public final Object f30246b;

    public r(Object obj, int i3) {
        this.f30245a = i3;
        this.f30246b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f30245a) {
            case 0:
                s sVar = (s) this.f30246b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                c0 c0Var = (c0) this.f30246b;
                c0Var.getClass();
                c0Var.f29028w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.f29009a.run();
                return;
            case 2:
                q1 q1Var = (q1) this.f30246b;
                q1Var.getClass();
                q1Var.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 3:
                h4 h4Var = (h4) this.f30246b;
                org.telegram.ui.Components.k9 k9Var = h4Var.f29326a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h4Var.I) {
                    f10 = 1.0f - (0.18f * floatValue);
                } else {
                    f10 = 0.82f + (0.18f * floatValue);
                }
                k9Var.setScaleX(f10);
                k9Var.setScaleY(f10);
                if (!h4Var.I) {
                    floatValue = 1.0f - floatValue;
                }
                h4Var.J = floatValue;
                h4Var.invalidate();
                return;
            case 4:
                l6 l6Var = (l6) this.f30246b;
                l6Var.getClass();
                l6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                return;
            case 5:
                n7 n7Var = (n7) this.f30246b;
                n7Var.getClass();
                n7Var.f29693j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                return;
            case 6:
                s7 s7Var = (s7) this.f30246b;
                s7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.f30350w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - s7Var.f30350w) * (-0.3f));
                }
                s7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                u9 u9Var = (u9) this.f30246b;
                u9Var.getClass();
                u9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.C.invalidate();
                return;
            default:
                x9 x9Var = (x9) ((org.telegram.ui.ActionBar.g1) this.f30246b).f27516b;
                ((y9) x9Var.f30971b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((y9) x9Var.f30971b).invalidate();
                return;
        }
    }
}
