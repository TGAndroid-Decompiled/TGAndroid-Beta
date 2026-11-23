package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.y40;
import org.telegram.ui.yp;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29100a;
    public final int f29101b;
    public final Object f29102c;

    public j2(Object obj, int i7, int i10) {
        this.f29100a = i10;
        this.f29102c = obj;
        this.f29101b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f29100a) {
            case 0:
                w2 w2Var = (w2) this.f29102c;
                w2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2Var.C0(this.f29101b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f29102c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == this.f29101b) {
                    r1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                wt wtVar = (wt) this.f29102c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtVar.d.setTranslationY(floatValue2);
                int i10 = this.f29101b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                wtVar.S = f11;
                if (i10 > 0 && ((i7 = wtVar.M) == 2 || i7 == 3)) {
                    wtVar.d.setAlpha(f11);
                }
                wtVar.c(floatValue2 - f10);
                return;
            case 3:
                ((qy) this.f29102c).R0[this.f29101b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                y40 y40Var = (y40) this.f29102c;
                if (this.f29101b == y40Var.f42346u0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    y40Var.f42350x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                yp ypVar = (yp) this.f29102c;
                ypVar.getClass();
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.f35754b.put(this.f29101b, (Float) valueAnimator.getAnimatedValue());
                hj0Var.d = true;
                hj0Var.f35753a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f29102c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f60686n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f29101b));
                fVar.f60688p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
