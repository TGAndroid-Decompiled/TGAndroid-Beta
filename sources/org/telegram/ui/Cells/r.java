package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f21741a;
    public final Object f21742b;

    public r(Object obj, int i10) {
        this.f21741a = i10;
        this.f21742b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f21741a) {
            case 0:
                s sVar = (s) this.f21742b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                f0 f0Var = (f0) this.f21742b;
                f0Var.getClass();
                f0Var.f21147w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f21129a.run();
                return;
            case 2:
                u1 u1Var = (u1) this.f21742b;
                u1Var.getClass();
                u1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                return;
            case 3:
                g4 g4Var = (g4) this.f21742b;
                org.telegram.ui.Components.z9 z9Var = g4Var.f21205a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (g4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                z9Var.setScaleX(f7);
                z9Var.setScaleY(f7);
                if (!g4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.I = floatValue;
                g4Var.invalidate();
                return;
            case 4:
                o6 o6Var = (o6) this.f21742b;
                o6Var.getClass();
                o6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                return;
            case 5:
                t7 t7Var = (t7) this.f21742b;
                t7Var.getClass();
                t7Var.f22109i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 6:
                z7 z7Var = (z7) this.f21742b;
                z7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                ba baVar = (ba) this.f21742b;
                baVar.getClass();
                baVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.C.invalidate();
                return;
            default:
                ea eaVar = (ea) ((da) this.f21742b).f21091b;
                eaVar.f21127a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.f21127a.invalidate();
                return;
        }
    }
}
