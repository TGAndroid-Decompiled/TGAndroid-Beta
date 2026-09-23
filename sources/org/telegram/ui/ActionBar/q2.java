package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.xq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19473a;
    public final int f19474b;
    public final Object f19475c;

    public q2(Object obj, int i10, int i11) {
        this.f19473a = i11;
        this.f19475c = obj;
        this.f19474b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19473a) {
            case 0:
                f3 f3Var = (f3) this.f19475c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f19474b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f19475c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f19474b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ku kuVar = (ku) this.f19475c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kuVar.d.setTranslationY(floatValue2);
                int i11 = this.f19474b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                kuVar.R = f10;
                if (i11 > 0 && ((i10 = kuVar.L) == 2 || i10 == 3)) {
                    kuVar.d.setAlpha(f10);
                }
                kuVar.c(floatValue2 - f7);
                return;
            case 3:
                ((lz) this.f19475c).Q0[this.f19474b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ca0 ca0Var = (ca0) this.f19475c;
                float[] fArr = ca0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19474b;
                fArr[i12] = floatValue3;
                i5[] i5VarArr = ca0Var.f23002w;
                i5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                i5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                i5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ca0Var.f23003x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                xq xqVar = (xq) this.f19475c;
                xqVar.getClass();
                rk0 rk0Var = (rk0) xqVar.d;
                rk0Var.f27658b.put(this.f19474b, (Float) valueAnimator.getAnimatedValue());
                rk0Var.d = true;
                rk0Var.f27657a.invalidate();
                return;
            default:
                vh.h hVar = (vh.h) this.f19475c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f44364n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.f19474b));
                hVar.f44366p = true;
                hVar.invalidateSelf();
                return;
        }
    }
}
