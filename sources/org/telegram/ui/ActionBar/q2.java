package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.qq;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21671a;
    public final int f21672b;
    public final Object f21673c;

    public q2(Object obj, int i10, int i11) {
        this.f21671a = i11;
        this.f21673c = obj;
        this.f21672b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21671a) {
            case 0:
                f3 f3Var = (f3) this.f21673c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.f21672b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21673c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21672b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                qu quVar = (qu) this.f21673c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                quVar.d.setTranslationY(floatValue2);
                int i11 = this.f21672b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                quVar.R = f10;
                if (i11 > 0 && ((i10 = quVar.L) == 2 || i10 == 3)) {
                    quVar.d.setAlpha(f10);
                }
                quVar.c(floatValue2 - f7);
                return;
            case 3:
                ((tz) this.f21673c).Q0[this.f21672b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                l60 l60Var = (l60) this.f21673c;
                if (this.f21672b == l60Var.f28101s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    l60Var.f28107x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                wa0 wa0Var = (wa0) this.f21673c;
                float[] fArr = wa0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21672b;
                fArr[i12] = floatValue4;
                j5[] j5VarArr = wa0Var.f32065w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                wa0Var.f32066x[i12].setAlpha(fArr[i12]);
                return;
            case 6:
                qq qqVar = (qq) this.f21673c;
                qqVar.getClass();
                nl0 nl0Var = (nl0) qqVar.d;
                nl0Var.f28790b.put(this.f21672b, (Float) valueAnimator.getAnimatedValue());
                nl0Var.d = true;
                nl0Var.f28789a.invalidate();
                return;
            default:
                wh.g gVar = (wh.g) this.f21673c;
                gVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49056n = floatValue5;
                gVar.setAlpha((int) ((1.0f - floatValue5) * this.f21672b));
                gVar.f49058p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
