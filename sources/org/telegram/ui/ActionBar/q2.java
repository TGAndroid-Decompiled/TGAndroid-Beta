package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.yq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21481a;
    public final int f21482b;
    public final Object f21483c;

    public q2(Object obj, int i10, int i11) {
        this.f21481a = i11;
        this.f21483c = obj;
        this.f21482b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21481a) {
            case 0:
                f3 f3Var = (f3) this.f21483c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f21482b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21483c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21482b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                mu muVar = (mu) this.f21483c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muVar.d.setTranslationY(floatValue2);
                int i11 = this.f21482b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                muVar.R = f10;
                if (i11 > 0 && ((i10 = muVar.L) == 2 || i10 == 3)) {
                    muVar.d.setAlpha(f10);
                }
                muVar.c(floatValue2 - f7);
                return;
            case 3:
                ((nz) this.f21483c).Q0[this.f21482b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                pa0 pa0Var = (pa0) this.f21483c;
                float[] fArr = pa0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21482b;
                fArr[i12] = floatValue3;
                i5[] i5VarArr = pa0Var.f29597w;
                i5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                i5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                i5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                pa0Var.f29598x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                yq yqVar = (yq) this.f21483c;
                yqVar.getClass();
                dl0 dl0Var = (dl0) yqVar.d;
                dl0Var.f25763b.put(this.f21482b, (Float) valueAnimator.getAnimatedValue());
                dl0Var.d = true;
                dl0Var.f25762a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f21483c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f48402n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f21482b));
                gVar.f48404p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
