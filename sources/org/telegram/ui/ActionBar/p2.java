package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wz;
import org.telegram.ui.fr;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20286a;
    public final int f20287b;
    public final Object f20288c;

    public p2(Object obj, int i10, int i11) {
        this.f20286a = i11;
        this.f20288c = obj;
        this.f20287b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f20286a) {
            case 0:
                e3 e3Var = (e3) this.f20288c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f20287b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f20288c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f20287b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                vu vuVar = (vu) this.f20288c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vuVar.d.setTranslationY(floatValue2);
                int i11 = this.f20287b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                vuVar.R = f10;
                if (i11 > 0 && ((i10 = vuVar.L) == 2 || i10 == 3)) {
                    vuVar.d.setAlpha(f10);
                }
                vuVar.c(floatValue2 - f7);
                return;
            case 3:
                ((wz) this.f20288c).Q0[this.f20287b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                o60 o60Var = (o60) this.f20288c;
                if (this.f20287b == o60Var.f27577s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    o60Var.f27583x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                cb0 cb0Var = (cb0) this.f20288c;
                float[] fArr = cb0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f20287b;
                fArr[i12] = floatValue4;
                h5[] h5VarArr = cb0Var.f23679w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                cb0Var.f23680x[i12].setAlpha(fArr[i12]);
                return;
            case 6:
                fr frVar = (fr) this.f20288c;
                frVar.getClass();
                rl0 rl0Var = (rl0) frVar.d;
                rl0Var.f28567b.put(this.f20287b, (Float) valueAnimator.getAnimatedValue());
                rl0Var.d = true;
                rl0Var.f28566a.invalidate();
                return;
            default:
                wh.g gVar = (wh.g) this.f20288c;
                gVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f47669n = floatValue5;
                gVar.setAlpha((int) ((1.0f - floatValue5) * this.f20287b));
                gVar.f47671p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
