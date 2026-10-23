package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.qq;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21808a;
    public final int f21809b;
    public final Object f21810c;

    public r2(Object obj, int i10, int i11) {
        this.f21808a = i11;
        this.f21810c = obj;
        this.f21809b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21808a) {
            case 0:
                h3 h3Var = (h3) this.f21810c;
                h3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var.setItemColor(this.f21809b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f21810c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f21809b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                qu quVar = (qu) this.f21810c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                quVar.d.setTranslationY(floatValue2);
                int i11 = this.f21809b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                quVar.R = f10;
                if (i11 > 0 && ((i10 = quVar.L) == 2 || i10 == 3)) {
                    quVar.d.setAlpha(f10);
                }
                quVar.c(floatValue2 - f7);
                return;
            case 3:
                ((tz) this.f21810c).Q0[this.f21809b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                m60 m60Var = (m60) this.f21810c;
                if (this.f21809b == m60Var.f28542s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    m60Var.f28548x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                xa0 xa0Var = (xa0) this.f21810c;
                float[] fArr = xa0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21809b;
                fArr[i12] = floatValue4;
                n5[] n5VarArr = xa0Var.f32508w;
                n5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                n5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                n5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                xa0Var.f32509x[i12].setAlpha(fArr[i12]);
                return;
            case 6:
                qq qqVar = (qq) this.f21810c;
                qqVar.getClass();
                rl0 rl0Var = (rl0) qqVar.d;
                rl0Var.f30222b.put(this.f21809b, (Float) valueAnimator.getAnimatedValue());
                rl0Var.d = true;
                rl0Var.f30221a.invalidate();
                return;
            default:
                wh.g gVar = (wh.g) this.f21810c;
                gVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49508n = floatValue5;
                gVar.setAlpha((int) ((1.0f - floatValue5) * this.f21809b));
                gVar.f49510p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
