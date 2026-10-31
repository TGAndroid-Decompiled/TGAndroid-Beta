package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f22859a;
    public final Object f22860b;

    public r(Object obj, int i10) {
        this.f22859a = i10;
        this.f22860b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f22859a) {
            case 0:
                s sVar = (s) this.f22860b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                c0 c0Var = (c0) this.f22860b;
                c0Var.getClass();
                c0Var.f21771w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.f21753a.run();
                return;
            case 2:
                q1 q1Var = (q1) this.f22860b;
                q1Var.getClass();
                q1Var.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 3:
                j4 j4Var = (j4) this.f22860b;
                org.telegram.ui.Components.g9 g9Var = j4Var.f22074a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (j4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                g9Var.setScaleX(f7);
                g9Var.setScaleY(f7);
                if (!j4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                j4Var.I = floatValue;
                j4Var.invalidate();
                return;
            case 4:
                q6 q6Var = (q6) this.f22860b;
                q6Var.getClass();
                q6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.invalidate();
                return;
            case 5:
                s7 s7Var = (s7) this.f22860b;
                s7Var.getClass();
                s7Var.f23029i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                return;
            case 6:
                x7 x7Var = (x7) this.f22860b;
                x7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.f23592w = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    org.telegram.messenger.i0.h(colorMatrix, (1.0f - x7Var.f23592w) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                w9 w9Var = (w9) this.f22860b;
                w9Var.getClass();
                w9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.C.invalidate();
                return;
            default:
                lg.f fVar = (lg.f) ((org.telegram.ui.ActionBar.l1) this.f22860b).f20531b;
                ((y9) fVar.f11865b).getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((y9) fVar.f11865b).invalidate();
                return;
        }
    }
}
