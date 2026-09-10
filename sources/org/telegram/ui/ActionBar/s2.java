package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.dr;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18619a;
    public final int f18620b;
    public final Object f18621c;

    public s2(Object obj, int i10, int i11) {
        this.f18619a = i11;
        this.f18621c = obj;
        this.f18620b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f18619a) {
            case 0:
                h3 h3Var = (h3) this.f18621c;
                h3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var.setItemColor(this.f18620b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f18621c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.f18620b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                nu nuVar = (nu) this.f18621c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nuVar.d.setTranslationY(floatValue2);
                int i11 = this.f18620b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                nuVar.R = f10;
                if (i11 > 0 && ((i10 = nuVar.L) == 2 || i10 == 3)) {
                    nuVar.d.setAlpha(f10);
                }
                nuVar.c(floatValue2 - f7);
                return;
            case 3:
                ((rz) this.f18621c).Q0[this.f18620b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                la0 la0Var = (la0) this.f18621c;
                float[] fArr = la0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.f18620b;
                fArr[i12] = floatValue3;
                l5[] l5VarArr = la0Var.f24926w;
                l5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                l5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                l5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                la0Var.f24927x[i12].setAlpha(fArr[i12]);
                return;
            case 5:
                dr drVar = (dr) this.f18621c;
                drVar.getClass();
                zk0 zk0Var = (zk0) drVar.d;
                zk0Var.f29713b.put(this.f18620b, (Float) valueAnimator.getAnimatedValue());
                zk0Var.d = true;
                zk0Var.f29712a.invalidate();
                return;
            default:
                uh.h hVar = (uh.h) this.f18621c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f42782n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.f18620b));
                hVar.f42784p = true;
                hVar.invalidateSelf();
                return;
        }
    }
}
