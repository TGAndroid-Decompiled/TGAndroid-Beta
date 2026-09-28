package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.wq;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19700a;
    public final int f19701b;
    public final Object f19702c;

    public p2(Object obj, int i10, int i11) {
        this.f19700a = i11;
        this.f19702c = obj;
        this.f19701b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19700a) {
            case 0:
                e3 e3Var = (e3) this.f19702c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f19701b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f19702c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f19701b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                lu luVar = (lu) this.f19702c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                luVar.d.setTranslationY(floatValue2);
                int i11 = this.f19701b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                luVar.R = f10;
                if (i11 > 0 && ((i10 = luVar.L) == 2 || i10 == 3)) {
                    luVar.d.setAlpha(f10);
                }
                luVar.c(floatValue2 - f7);
                return;
            case 3:
                ((mz) this.f19702c).Q0[this.f19701b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                pa0 pa0Var = (pa0) this.f19702c;
                float[] fArr = pa0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19701b;
                fArr[i12] = floatValue3;
                h5[] h5VarArr = pa0Var.f27329w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                pa0Var.f27330x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                wq wqVar = (wq) this.f19702c;
                wqVar.getClass();
                dl0 dl0Var = (dl0) wqVar.d;
                dl0Var.f23685b.put(this.f19701b, (Float) valueAnimator.getAnimatedValue());
                dl0Var.d = true;
                dl0Var.f23684a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f19702c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f44694n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f19701b));
                gVar.f44696p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
