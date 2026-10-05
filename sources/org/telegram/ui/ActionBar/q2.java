package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.yq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21485a;
    public final int f21486b;
    public final Object f21487c;

    public q2(Object obj, int i10, int i11) {
        this.f21485a = i11;
        this.f21487c = obj;
        this.f21486b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21485a) {
            case 0:
                f3 f3Var = (f3) this.f21487c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f21486b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21487c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21486b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                mu muVar = (mu) this.f21487c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muVar.d.setTranslationY(floatValue2);
                int i11 = this.f21486b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                muVar.R = f10;
                if (i11 > 0 && ((i10 = muVar.L) == 2 || i10 == 3)) {
                    muVar.d.setAlpha(f10);
                }
                muVar.c(floatValue2 - f7);
                return;
            case 3:
                ((nz) this.f21487c).Q0[this.f21486b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                pa0 pa0Var = (pa0) this.f21487c;
                float[] fArr = pa0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21486b;
                fArr[i12] = floatValue3;
                i5[] i5VarArr = pa0Var.f29690w;
                i5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                i5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                i5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                pa0Var.f29691x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                yq yqVar = (yq) this.f21487c;
                yqVar.getClass();
                dl0 dl0Var = (dl0) yqVar.d;
                dl0Var.f25818b.put(this.f21486b, (Float) valueAnimator.getAnimatedValue());
                dl0Var.d = true;
                dl0Var.f25817a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f21487c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f48409n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f21486b));
                gVar.f48411p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
