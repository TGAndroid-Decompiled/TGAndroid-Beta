package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f22706a;
    public final Object f22707b;

    public r(Object obj, int i10) {
        this.f22706a = i10;
        this.f22707b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f22706a) {
            case 0:
                s sVar = (s) this.f22707b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f22707b;
                e0Var.getClass();
                e0Var.f22015w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f21996a.run();
                return;
            case 2:
                u1 u1Var = (u1) this.f22707b;
                u1Var.getClass();
                u1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                return;
            case 3:
                g4 g4Var = (g4) this.f22707b;
                org.telegram.ui.Components.w9 w9Var = g4Var.f22140a;
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
                o6 o6Var = (o6) this.f22707b;
                o6Var.getClass();
                o6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                return;
            case 5:
                t7 t7Var = (t7) this.f22707b;
                t7Var.getClass();
                t7Var.f23085i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 6:
                z7 z7Var = (z7) this.f22707b;
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
                da daVar = (da) this.f22707b;
                daVar.getClass();
                daVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.C.invalidate();
                return;
            default:
                ga gaVar = (ga) ((fa) this.f22707b).f22118b;
                gaVar.f22182a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.f22182a.invalidate();
                return;
        }
    }
}
