package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.zq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19745a;
    public final int f19746b;
    public final Object f19747c;

    public q2(Object obj, int i10, int i11) {
        this.f19745a = i11;
        this.f19747c = obj;
        this.f19746b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f19745a) {
            case 0:
                f3 f3Var = (f3) this.f19747c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f19746b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f19747c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f19746b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ju juVar = (ju) this.f19747c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                juVar.d.setTranslationY(floatValue2);
                int i11 = this.f19746b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                juVar.R = f10;
                if (i11 > 0 && ((i10 = juVar.L) == 2 || i10 == 3)) {
                    juVar.d.setAlpha(f10);
                }
                juVar.c(floatValue2 - f7);
                return;
            case 3:
                ((kz) this.f19747c).Q0[this.f19746b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ma0 ma0Var = (ma0) this.f19747c;
                float[] fArr = ma0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f19746b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = ma0Var.f26414w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ma0Var.f26415x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                zq zqVar = (zq) this.f19747c;
                zqVar.getClass();
                dl0 dl0Var = (dl0) zqVar.d;
                dl0Var.f23710b.put(this.f19746b, (Float) valueAnimator.getAnimatedValue());
                dl0Var.d = true;
                dl0Var.f23709a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f19747c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f44732n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f19746b));
                gVar.f44734p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
