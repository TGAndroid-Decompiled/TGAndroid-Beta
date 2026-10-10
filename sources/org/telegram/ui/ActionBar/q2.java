package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.zq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21492a;
    public final int f21493b;
    public final Object f21494c;

    public q2(Object obj, int i10, int i11) {
        this.f21492a = i11;
        this.f21494c = obj;
        this.f21493b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21492a) {
            case 0:
                f3 f3Var = (f3) this.f21494c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f21493b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21494c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21493b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                av avVar = (av) this.f21494c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avVar.d.setTranslationY(floatValue2);
                int i11 = this.f21493b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                avVar.R = f10;
                if (i11 > 0 && ((i10 = avVar.L) == 2 || i10 == 3)) {
                    avVar.d.setAlpha(f10);
                }
                avVar.c(floatValue2 - f7);
                return;
            case 3:
                ((b00) this.f21494c).Q0[this.f21493b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                eb0 eb0Var = (eb0) this.f21494c;
                float[] fArr = eb0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21493b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = eb0Var.f26001w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                eb0Var.f26002x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                zq zqVar = (zq) this.f21494c;
                zqVar.getClass();
                wl0 wl0Var = (wl0) zqVar.d;
                wl0Var.f32700b.put(this.f21493b, (Float) valueAnimator.getAnimatedValue());
                wl0Var.d = true;
                wl0Var.f32699a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f21494c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49735n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f21493b));
                gVar.f49737p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
