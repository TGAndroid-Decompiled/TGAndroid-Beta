package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.br;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19539a;
    public final int f19540b;
    public final Object f19541c;

    public r2(Object obj, int i10, int i11) {
        this.f19539a = i11;
        this.f19541c = obj;
        this.f19540b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19539a) {
            case 0:
                g3 g3Var = (g3) this.f19541c;
                g3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g3Var.setItemColor(this.f19540b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f19541c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f19540b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ju juVar = (ju) this.f19541c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                juVar.d.setTranslationY(floatValue2);
                int i11 = this.f19540b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                juVar.R = f10;
                if (i11 > 0 && ((i10 = juVar.L) == 2 || i10 == 3)) {
                    juVar.d.setAlpha(f10);
                }
                juVar.c(floatValue2 - f7);
                return;
            case 3:
                ((kz) this.f19541c).Q0[this.f19540b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ba0 ba0Var = (ba0) this.f19541c;
                float[] fArr = ba0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19540b;
                fArr[i12] = floatValue3;
                k5[] k5VarArr = ba0Var.f22691w;
                k5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                k5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                k5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ba0Var.f22692x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                br brVar = (br) this.f19541c;
                brVar.getClass();
                rk0 rk0Var = (rk0) brVar.d;
                rk0Var.f27637b.put(this.f19540b, (Float) valueAnimator.getAnimatedValue());
                rk0Var.d = true;
                rk0Var.f27636a.invalidate();
                return;
            default:
                vh.h hVar = (vh.h) this.f19541c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f44442n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.f19540b));
                hVar.f44444p = true;
                hVar.invalidateSelf();
                return;
        }
    }
}
