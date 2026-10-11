package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.zq;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21476a;
    public final int f21477b;
    public final Object f21478c;

    public p2(Object obj, int i10, int i11) {
        this.f21476a = i11;
        this.f21478c = obj;
        this.f21477b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21476a) {
            case 0:
                e3 e3Var = (e3) this.f21478c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f21477b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21478c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21477b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                av avVar = (av) this.f21478c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avVar.d.setTranslationY(floatValue2);
                int i11 = this.f21477b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                avVar.R = f10;
                if (i11 > 0 && ((i10 = avVar.L) == 2 || i10 == 3)) {
                    avVar.d.setAlpha(f10);
                }
                avVar.c(floatValue2 - f7);
                return;
            case 3:
                ((b00) this.f21478c).Q0[this.f21477b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                s60 s60Var = (s60) this.f21478c;
                if (this.f21477b == s60Var.f30771s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    s60Var.f30777x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                db0 db0Var = (db0) this.f21478c;
                float[] fArr = db0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21477b;
                fArr[i12] = floatValue4;
                h5[] h5VarArr = db0Var.f25752w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                db0Var.f25753x[i12].setAlpha(fArr[i12]);
                return;
            case 6:
                zq zqVar = (zq) this.f21478c;
                zqVar.getClass();
                wl0 wl0Var = (wl0) zqVar.d;
                wl0Var.f32730b.put(this.f21477b, (Float) valueAnimator.getAnimatedValue());
                wl0Var.d = true;
                wl0Var.f32729a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f21478c;
                gVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49812n = floatValue5;
                gVar.setAlpha((int) ((1.0f - floatValue5) * this.f21477b));
                gVar.f49814p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
