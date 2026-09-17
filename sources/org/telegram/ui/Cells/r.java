package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f22508a;
    public final Object f22509b;

    public r(Object obj, int i10) {
        this.f22508a = i10;
        this.f22509b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f22508a) {
            case 0:
                s sVar = (s) this.f22509b;
                sVar.getClass();
                sVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e0 e0Var = (e0) this.f22509b;
                e0Var.getClass();
                e0Var.f21831w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f21812a.run();
                return;
            case 2:
                t1 t1Var = (t1) this.f22509b;
                t1Var.getClass();
                t1Var.Bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 3:
                f4 f4Var = (f4) this.f22509b;
                org.telegram.ui.Components.x9 x9Var = f4Var.f21909a;
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
                n6 n6Var = (n6) this.f22509b;
                n6Var.getClass();
                n6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 5:
                t7 t7Var = (t7) this.f22509b;
                t7Var.getClass();
                t7Var.f23272i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 6:
                z7 z7Var = (z7) this.f22509b;
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
                da daVar = (da) this.f22509b;
                daVar.getClass();
                daVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.C.invalidate();
                return;
            default:
                ga gaVar = (ga) ((fa) this.f22509b).f21956b;
                gaVar.f21999a.getTransitionParams().K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.f21999a.invalidate();
                return;
        }
    }
}
