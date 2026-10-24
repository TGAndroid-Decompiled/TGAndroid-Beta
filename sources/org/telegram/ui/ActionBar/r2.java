package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.va0;
import org.telegram.ui.qq;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21809a;
    public final int f21810b;
    public final Object f21811c;

    public r2(Object obj, int i10, int i11) {
        this.f21809a = i11;
        this.f21811c = obj;
        this.f21810b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21809a) {
            case 0:
                h3 h3Var = (h3) this.f21811c;
                h3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var.setItemColor(this.f21810b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f21811c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f21810b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                ou ouVar = (ou) this.f21811c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ouVar.d.setTranslationY(floatValue2);
                int i11 = this.f21810b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                ouVar.R = f10;
                if (i11 > 0 && ((i10 = ouVar.L) == 2 || i10 == 3)) {
                    ouVar.d.setAlpha(f10);
                }
                ouVar.c(floatValue2 - f7);
                return;
            case 3:
                ((rz) this.f21811c).Q0[this.f21810b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                k60 k60Var = (k60) this.f21811c;
                if (this.f21810b == k60Var.f27896s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    k60Var.f27902x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                va0 va0Var = (va0) this.f21811c;
                float[] fArr = va0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21810b;
                fArr[i12] = floatValue4;
                n5[] n5VarArr = va0Var.f31407w;
                n5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                n5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                n5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                va0Var.f31408x[i12].setAlpha(fArr[i12]);
                return;
            case 6:
                qq qqVar = (qq) this.f21811c;
                qqVar.getClass();
                ql0 ql0Var = (ql0) qqVar.d;
                ql0Var.f29949b.put(this.f21810b, (Float) valueAnimator.getAnimatedValue());
                ql0Var.d = true;
                ql0Var.f29948a.invalidate();
                return;
            default:
                wh.g gVar = (wh.g) this.f21811c;
                gVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49507n = floatValue5;
                gVar.setAlpha((int) ((1.0f - floatValue5) * this.f21810b));
                gVar.f49509p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
