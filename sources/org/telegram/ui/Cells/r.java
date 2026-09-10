package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f19727a;
    public final Object f19728b;

    public r(Object obj, int i10) {
        this.f19727a = i10;
        this.f19728b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f19727a) {
            case 0:
                s sVar = (s) this.f19728b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f19728b;
                e0Var.getClass();
                e0Var.f19045w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f19027a.run();
                return;
            case 2:
                t1 t1Var = (t1) this.f19728b;
                t1Var.getClass();
                t1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 3:
                g4 g4Var = (g4) this.f19728b;
                org.telegram.ui.Components.w9 w9Var = g4Var.f19186a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (g4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                w9Var.setScaleX(f7);
                w9Var.setScaleY(f7);
                if (!g4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.I = floatValue;
                g4Var.invalidate();
                return;
            case 4:
                p6 p6Var = (p6) this.f19728b;
                p6Var.getClass();
                p6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.invalidate();
                return;
            case 5:
                u7 u7Var = (u7) this.f19728b;
                u7Var.getClass();
                u7Var.f20505i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                return;
            case 6:
                a8 a8Var = (a8) this.f19728b;
                a8Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                fa faVar = (fa) this.f19728b;
                faVar.getClass();
                faVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.C.invalidate();
                return;
            default:
                ia iaVar = (ia) ((ha) this.f19728b).f19285b;
                iaVar.f19322a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f19322a.invalidate();
                return;
        }
    }
}
