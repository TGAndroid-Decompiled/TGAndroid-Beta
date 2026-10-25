package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f24839a;
    public final Object f24840b;

    public r(Object obj, int i10) {
        this.f24839a = i10;
        this.f24840b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f24839a) {
            case 0:
                s sVar = (s) this.f24840b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                d0 d0Var = (d0) this.f24840b;
                d0Var.getClass();
                d0Var.f23978w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f23960a.run();
                return;
            case 2:
                s1 s1Var = (s1) this.f24840b;
                s1Var.getClass();
                s1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 3:
                t3 t3Var = (t3) this.f24840b;
                t3Var.getClass();
                t3Var.f25438f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var.b();
                t3Var.invalidate();
                return;
            case 4:
                k4 k4Var = (k4) this.f24840b;
                org.telegram.ui.Components.y9 y9Var = k4Var.f24319a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (k4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                y9Var.setScaleX(f7);
                y9Var.setScaleY(f7);
                if (!k4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                k4Var.I = floatValue;
                k4Var.invalidate();
                return;
            case 5:
                s6 s6Var = (s6) this.f24840b;
                s6Var.getClass();
                s6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.invalidate();
                return;
            case 6:
                w7 w7Var = (w7) this.f24840b;
                w7Var.getClass();
                w7Var.f25644i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                return;
            case 7:
                c8 c8Var = (c8) this.f24840b;
                c8Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c8Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - c8Var.v) * (-0.3f));
                }
                c8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 8:
                fa faVar = (fa) this.f24840b;
                faVar.getClass();
                faVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.C.invalidate();
                return;
            default:
                ia iaVar = (ia) ((ha) this.f24840b).f24212b;
                iaVar.f24258a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.f24258a.invalidate();
                return;
        }
    }
}
