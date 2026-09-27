package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.xq;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19750a;
    public final int f19751b;
    public final Object f19752c;

    public r2(Object obj, int i10, int i11) {
        this.f19750a = i11;
        this.f19752c = obj;
        this.f19751b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19750a) {
            case 0:
                g3 g3Var = (g3) this.f19752c;
                g3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g3Var.setItemColor(this.f19751b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f19752c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f19751b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                lu luVar = (lu) this.f19752c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                luVar.d.setTranslationY(floatValue2);
                int i11 = this.f19751b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                luVar.R = f10;
                if (i11 > 0 && ((i10 = luVar.L) == 2 || i10 == 3)) {
                    luVar.d.setAlpha(f10);
                }
                luVar.c(floatValue2 - f7);
                return;
            case 3:
                ((mz) this.f19752c).Q0[this.f19751b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                oa0 oa0Var = (oa0) this.f19752c;
                float[] fArr = oa0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19751b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = oa0Var.f27060w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                oa0Var.f27061x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                xq xqVar = (xq) this.f19752c;
                xqVar.getClass();
                dl0 dl0Var = (dl0) xqVar.d;
                dl0Var.f23687b.put(this.f19751b, (Float) valueAnimator.getAnimatedValue());
                dl0Var.d = true;
                dl0Var.f23686a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f19752c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f44740n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f19751b));
                gVar.f44742p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
