package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.cr;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21307a;
    public final int f21308b;
    public final Object f21309c;

    public q2(Object obj, int i10, int i11) {
        this.f21307a = i11;
        this.f21309c = obj;
        this.f21308b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21307a) {
            case 0:
                f3 f3Var = (f3) this.f21309c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f21308b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f21309c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f21308b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                hu huVar = (hu) this.f21309c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                huVar.d.setTranslationY(floatValue2);
                int i11 = this.f21308b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                huVar.R = f10;
                if (i11 > 0 && ((i10 = huVar.L) == 2 || i10 == 3)) {
                    huVar.d.setAlpha(f10);
                }
                huVar.c(floatValue2 - f7);
                return;
            case 3:
                ((kz) this.f21309c).Q0[this.f21308b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ca0 ca0Var = (ca0) this.f21309c;
                float[] fArr = ca0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21308b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = ca0Var.f24955w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ca0Var.f24956x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                cr crVar = (cr) this.f21309c;
                crVar.getClass();
                qk0 qk0Var = (qk0) crVar.d;
                qk0Var.f29754b.put(this.f21308b, (Float) valueAnimator.getAnimatedValue());
                qk0Var.d = true;
                qk0Var.f29753a.invalidate();
                return;
            default:
                wh.h hVar = (wh.h) this.f21309c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f48624n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.f21308b));
                hVar.f48626p = true;
                hVar.invalidateSelf();
                return;
        }
    }
}
