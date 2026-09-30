package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.wq;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19717a;
    public final int f19718b;
    public final Object f19719c;

    public p2(Object obj, int i10, int i11) {
        this.f19717a = i11;
        this.f19719c = obj;
        this.f19718b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19717a) {
            case 0:
                e3 e3Var = (e3) this.f19719c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f19718b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f19719c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f19718b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                mu muVar = (mu) this.f19719c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muVar.d.setTranslationY(floatValue2);
                int i11 = this.f19718b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                muVar.R = f10;
                if (i11 > 0 && ((i10 = muVar.L) == 2 || i10 == 3)) {
                    muVar.d.setAlpha(f10);
                }
                muVar.c(floatValue2 - f7);
                return;
            case 3:
                ((nz) this.f19719c).Q0[this.f19718b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                qa0 qa0Var = (qa0) this.f19719c;
                float[] fArr = qa0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19718b;
                fArr[i12] = floatValue3;
                h5[] h5VarArr = qa0Var.f27635w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                qa0Var.f27636x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                wq wqVar = (wq) this.f19719c;
                wqVar.getClass();
                el0 el0Var = (el0) wqVar.d;
                el0Var.f24005b.put(this.f19718b, (Float) valueAnimator.getAnimatedValue());
                el0Var.d = true;
                el0Var.f24004a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f19719c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f44802n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f19718b));
                gVar.f44804p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
