package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.na0;
import org.telegram.ui.wq;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19701a;
    public final int f19702b;
    public final Object f19703c;

    public p2(Object obj, int i10, int i11) {
        this.f19701a = i11;
        this.f19703c = obj;
        this.f19702b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19701a) {
            case 0:
                e3 e3Var = (e3) this.f19703c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f19702b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f19703c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f19702b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ku kuVar = (ku) this.f19703c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kuVar.d.setTranslationY(floatValue2);
                int i11 = this.f19702b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                kuVar.R = f10;
                if (i11 > 0 && ((i10 = kuVar.L) == 2 || i10 == 3)) {
                    kuVar.d.setAlpha(f10);
                }
                kuVar.c(floatValue2 - f7);
                return;
            case 3:
                ((lz) this.f19703c).Q0[this.f19702b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                na0 na0Var = (na0) this.f19703c;
                float[] fArr = na0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19702b;
                fArr[i12] = floatValue3;
                h5[] h5VarArr = na0Var.f26715w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                na0Var.f26716x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                wq wqVar = (wq) this.f19703c;
                wqVar.getClass();
                bl0 bl0Var = (bl0) wqVar.d;
                bl0Var.f23041b.put(this.f19702b, (Float) valueAnimator.getAnimatedValue());
                bl0Var.d = true;
                bl0Var.f23040a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f19703c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f44695n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f19702b));
                gVar.f44697p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
