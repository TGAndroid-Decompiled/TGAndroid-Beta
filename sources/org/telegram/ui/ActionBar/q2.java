package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.zq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19698a;
    public final int f19699b;
    public final Object f19700c;

    public q2(Object obj, int i10, int i11) {
        this.f19698a = i11;
        this.f19700c = obj;
        this.f19699b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19698a) {
            case 0:
                f3 f3Var = (f3) this.f19700c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f19699b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f19700c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f19699b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ju juVar = (ju) this.f19700c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                juVar.d.setTranslationY(floatValue2);
                int i11 = this.f19699b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                juVar.R = f10;
                if (i11 > 0 && ((i10 = juVar.L) == 2 || i10 == 3)) {
                    juVar.d.setAlpha(f10);
                }
                juVar.c(floatValue2 - f7);
                return;
            case 3:
                ((kz) this.f19700c).Q0[this.f19699b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ka0 ka0Var = (ka0) this.f19700c;
                float[] fArr = ka0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19699b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = ka0Var.f25670w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ka0Var.f25671x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                zq zqVar = (zq) this.f19700c;
                zqVar.getClass();
                bl0 bl0Var = (bl0) zqVar.d;
                bl0Var.f23033b.put(this.f19699b, (Float) valueAnimator.getAnimatedValue());
                bl0Var.d = true;
                bl0Var.f23032a.invalidate();
                return;
            default:
                vh.h hVar = (vh.h) this.f19700c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f44667n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.f19699b));
                hVar.f44669p = true;
                hVar.invalidateSelf();
                return;
        }
    }
}
