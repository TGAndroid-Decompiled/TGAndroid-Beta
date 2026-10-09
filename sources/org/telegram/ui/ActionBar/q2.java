package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.zq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21488a;
    public final int f21489b;
    public final Object f21490c;

    public q2(Object obj, int i10, int i11) {
        this.f21488a = i11;
        this.f21490c = obj;
        this.f21489b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21488a) {
            case 0:
                f3 f3Var = (f3) this.f21490c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f21489b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21490c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21489b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                zu zuVar = (zu) this.f21490c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zuVar.d.setTranslationY(floatValue2);
                int i11 = this.f21489b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                zuVar.R = f10;
                if (i11 > 0 && ((i10 = zuVar.L) == 2 || i10 == 3)) {
                    zuVar.d.setAlpha(f10);
                }
                zuVar.c(floatValue2 - f7);
                return;
            case 3:
                ((a00) this.f21490c).Q0[this.f21489b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                db0 db0Var = (db0) this.f21490c;
                float[] fArr = db0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21489b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = db0Var.f25685w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                db0Var.f25686x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                zq zqVar = (zq) this.f21490c;
                zqVar.getClass();
                vl0 vl0Var = (vl0) zqVar.d;
                vl0Var.f31817b.put(this.f21489b, (Float) valueAnimator.getAnimatedValue());
                vl0Var.d = true;
                vl0Var.f31816a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f21490c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49689n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f21489b));
                gVar.f49691p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
