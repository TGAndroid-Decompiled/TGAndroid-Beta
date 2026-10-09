package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f22699a;
    public final Object f22700b;

    public r(Object obj, int i10) {
        this.f22699a = i10;
        this.f22700b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f22699a) {
            case 0:
                s sVar = (s) this.f22700b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f22700b;
                e0Var.getClass();
                e0Var.f22017w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f21998a.run();
                return;
            case 2:
                u1 u1Var = (u1) this.f22700b;
                u1Var.getClass();
                u1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                return;
            case 3:
                g4 g4Var = (g4) this.f22700b;
                org.telegram.ui.Components.y9 y9Var = g4Var.f22122a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (g4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                y9Var.setScaleX(f7);
                y9Var.setScaleY(f7);
                if (!g4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                g4Var.I = floatValue;
                g4Var.invalidate();
                return;
            case 4:
                o6 o6Var = (o6) this.f22700b;
                o6Var.getClass();
                o6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                return;
            case 5:
                t7 t7Var = (t7) this.f22700b;
                t7Var.getClass();
                t7Var.f23074i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 6:
                z7 z7Var = (z7) this.f22700b;
                z7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                ba baVar = (ba) this.f22700b;
                baVar.getClass();
                baVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.C.invalidate();
                return;
            default:
                ea eaVar = (ea) ((da) this.f22700b).f21996b;
                eaVar.f22054a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.f22054a.invalidate();
                return;
        }
    }
}
