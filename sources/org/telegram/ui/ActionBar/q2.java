package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kz;
import org.telegram.ui.zq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19730a;
    public final int f19731b;
    public final Object f19732c;

    public q2(Object obj, int i10, int i11) {
        this.f19730a = i11;
        this.f19732c = obj;
        this.f19731b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19730a) {
            case 0:
                f3 f3Var = (f3) this.f19732c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f19731b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f19732c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f19731b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ju juVar = (ju) this.f19732c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                juVar.d.setTranslationY(floatValue2);
                int i11 = this.f19731b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                juVar.R = f10;
                if (i11 > 0 && ((i10 = juVar.L) == 2 || i10 == 3)) {
                    juVar.d.setAlpha(f10);
                }
                juVar.c(floatValue2 - f7);
                return;
            case 3:
                ((kz) this.f19732c).Q0[this.f19731b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ja0 ja0Var = (ja0) this.f19732c;
                float[] fArr = ja0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19731b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = ja0Var.f25327w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ja0Var.f25328x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                zq zqVar = (zq) this.f19732c;
                zqVar.getClass();
                al0 al0Var = (al0) zqVar.d;
                al0Var.f22711b.put(this.f19731b, (Float) valueAnimator.getAnimatedValue());
                al0Var.d = true;
                al0Var.f22710a.invalidate();
                return;
            default:
                vh.h hVar = (vh.h) this.f19732c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f44711n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.f19731b));
                hVar.f44713p = true;
                hVar.invalidateSelf();
                return;
        }
    }
}
