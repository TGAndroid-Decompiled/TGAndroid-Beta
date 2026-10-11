package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.zq;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21440a;
    public final int f21441b;
    public final Object f21442c;

    public p2(Object obj, int i10, int i11) {
        this.f21440a = i11;
        this.f21442c = obj;
        this.f21441b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21440a) {
            case 0:
                e3 e3Var = (e3) this.f21442c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.f21441b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21442c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.f21441b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                av avVar = (av) this.f21442c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avVar.d.setTranslationY(floatValue2);
                int i11 = this.f21441b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                avVar.R = f10;
                if (i11 > 0 && ((i10 = avVar.L) == 2 || i10 == 3)) {
                    avVar.d.setAlpha(f10);
                }
                avVar.c(floatValue2 - f7);
                return;
            case 3:
                ((b00) this.f21442c).Q0[this.f21441b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                eb0 eb0Var = (eb0) this.f21442c;
                float[] fArr = eb0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f21441b;
                fArr[i12] = floatValue3;
                h5[] h5VarArr = eb0Var.f25965w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                eb0Var.f25966x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                zq zqVar = (zq) this.f21442c;
                zqVar.getClass();
                xl0 xl0Var = (xl0) zqVar.d;
                xl0Var.f32980b.put(this.f21441b, (Float) valueAnimator.getAnimatedValue());
                xl0Var.d = true;
                xl0Var.f32979a.invalidate();
                return;
            default:
                vh.g gVar = (vh.g) this.f21442c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.f49778n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.f21441b));
                gVar.f49780p = true;
                gVar.invalidateSelf();
                return;
        }
    }
}
