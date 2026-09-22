package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.br;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19507a;
    public final int f19508b;
    public final Object f19509c;

    public q2(Object obj, int i10, int i11) {
        this.f19507a = i11;
        this.f19509c = obj;
        this.f19508b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19507a) {
            case 0:
                f3 f3Var = (f3) this.f19509c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f19508b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f19509c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f19508b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ju juVar = (ju) this.f19509c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                juVar.d.setTranslationY(floatValue2);
                int i11 = this.f19508b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                juVar.R = f10;
                if (i11 > 0 && ((i10 = juVar.L) == 2 || i10 == 3)) {
                    juVar.d.setAlpha(f10);
                }
                juVar.c(floatValue2 - f7);
                return;
            case 3:
                ((kz) this.f19509c).Q0[this.f19508b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ba0 ba0Var = (ba0) this.f19509c;
                float[] fArr = ba0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19508b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = ba0Var.f22738w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ba0Var.f22739x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                br brVar = (br) this.f19509c;
                brVar.getClass();
                qk0 qk0Var = (qk0) brVar.d;
                qk0Var.f27371b.put(this.f19508b, (Float) valueAnimator.getAnimatedValue());
                qk0Var.d = true;
                qk0Var.f27370a.invalidate();
                return;
            default:
                vh.h hVar = (vh.h) this.f19509c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f44410n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.f19508b));
                hVar.f44412p = true;
                hVar.invalidateSelf();
                return;
        }
    }
}
