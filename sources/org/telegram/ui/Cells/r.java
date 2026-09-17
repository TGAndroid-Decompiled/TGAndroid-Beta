package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f22535a;
    public final Object f22536b;

    public r(Object obj, int i10) {
        this.f22535a = i10;
        this.f22536b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f22535a) {
            case 0:
                s sVar = (s) this.f22536b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f22536b;
                e0Var.getClass();
                e0Var.f21858w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f21839a.run();
                return;
            case 2:
                t1 t1Var = (t1) this.f22536b;
                t1Var.getClass();
                t1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 3:
                f4 f4Var = (f4) this.f22536b;
                org.telegram.ui.Components.x9 x9Var = f4Var.f21936a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f4Var.H) {
                    f7 = 1.0f - (0.18f * floatValue);
                } else {
                    f7 = 0.82f + (0.18f * floatValue);
                }
                x9Var.setScaleX(f7);
                x9Var.setScaleY(f7);
                if (!f4Var.H) {
                    floatValue = 1.0f - floatValue;
                }
                f4Var.I = floatValue;
                f4Var.invalidate();
                return;
            case 4:
                n6 n6Var = (n6) this.f22536b;
                n6Var.getClass();
                n6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 5:
                t7 t7Var = (t7) this.f22536b;
                t7Var.getClass();
                t7Var.f23299i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 6:
                z7 z7Var = (z7) this.f22536b;
                z7Var.getClass();
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.v = floatValue2;
                colorMatrix.setSaturation(floatValue2);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 7:
                da daVar = (da) this.f22536b;
                daVar.getClass();
                daVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.C.invalidate();
                return;
            default:
                ga gaVar = (ga) ((fa) this.f22536b).f21983b;
                gaVar.f22026a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.f22026a.invalidate();
                return;
        }
    }
}
