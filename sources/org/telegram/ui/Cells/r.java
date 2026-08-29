package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f25092a;
    public final Object f25093b;

    public r(Object obj, int i10) {
        this.f25092a = i10;
        this.f25093b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f9;
        switch (this.f25092a) {
            case 0:
                s sVar = (s) this.f25093b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f25093b;
                e0Var.getClass();
                e0Var.f24267w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f24248a.run();
                return;
            case 2:
                s1 s1Var = (s1) this.f25093b;
                s1Var.getClass();
                s1Var.xb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 3:
                e4 e4Var = (e4) this.f25093b;
                org.telegram.ui.Components.t9 t9Var = e4Var.f24277a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (e4Var.D) {
                    f9 = 1.0f - (0.18f * floatValue);
                } else {
                    f9 = 0.82f + (0.18f * floatValue);
                }
                t9Var.setScaleX(f9);
                t9Var.setScaleY(f9);
                if (!e4Var.D) {
                    floatValue = 1.0f - floatValue;
                }
                e4Var.E = floatValue;
                e4Var.invalidate();
                return;
            case 4:
                l6 l6Var = (l6) this.f25093b;
                l6Var.getClass();
                l6Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                return;
            case 5:
                p7 p7Var = (p7) this.f25093b;
                p7Var.getClass();
                p7Var.f24982e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 6:
                v7 v7Var = (v7) this.f25093b;
                v7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - v7Var.v) * (-0.3f));
                }
                v7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                x9 x9Var = (x9) this.f25093b;
                x9Var.getClass();
                x9Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.C.invalidate();
                return;
            default:
                aa aaVar = (aa) ((z9) this.f25093b).f26066b;
                aaVar.f24101a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.f24101a.invalidate();
                return;
        }
    }
}
