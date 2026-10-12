package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.cr;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21214a;
    public final int f21215b;
    public final Object f21216c;

    public p2(Object obj, int i10, int i11) {
        this.f21214a = i11;
        this.f21216c = obj;
        this.f21215b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21214a) {
            case 0:
                e3 e3Var = (e3) this.f21216c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f21215b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21216c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21215b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                cv cvVar = (cv) this.f21216c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cvVar.d.setTranslationY(floatValue2);
                int i11 = this.f21215b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                cvVar.R = f10;
                if (i11 > 0 && ((i10 = cvVar.L) == 2 || i10 == 3)) {
                    cvVar.d.setAlpha(f10);
                }
                cvVar.c(floatValue2 - f7);
                return;
            case 3:
                ((d00) this.f21216c).Q0[this.f21215b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                v60 v60Var = (v60) this.f21216c;
                if (this.f21215b == v60Var.f31433s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    v60Var.f31439x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                hb0 hb0Var = (hb0) this.f21216c;
                float[] fArr = hb0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21215b;
                fArr[i12] = floatValue4;
                h5[] h5VarArr = hb0Var.f26742w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                hb0Var.f26743x[i12].setAlpha(fArr[i12]);
                return;
            case 6:
                cr crVar = (cr) this.f21216c;
                crVar.getClass();
                bm0 bm0Var = (bm0) crVar.d;
                bm0Var.f24685b.put(this.f21215b, (Float) valueAnimator.getAnimatedValue());
                bm0Var.d = true;
                bm0Var.f24684a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f21216c;
                gVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49919n = floatValue5;
                gVar.setAlpha((int) ((1.0f - floatValue5) * this.f21215b));
                gVar.f49921p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
