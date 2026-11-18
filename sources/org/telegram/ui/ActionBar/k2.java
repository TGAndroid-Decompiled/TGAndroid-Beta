package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.y40;
import org.telegram.ui.yp;
public final class k2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29119a;
    public final int f29120b;
    public final Object f29121c;

    public k2(Object obj, int i7, int i10) {
        this.f29119a = i10;
        this.f29121c = obj;
        this.f29120b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f29119a) {
            case 0:
                x2 x2Var = (x2) this.f29121c;
                x2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var.C0(this.f29120b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f29121c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == this.f29120b) {
                    r1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                wt wtVar = (wt) this.f29121c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtVar.d.setTranslationY(floatValue2);
                int i10 = this.f29120b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                wtVar.S = f11;
                if (i10 > 0 && ((i7 = wtVar.M) == 2 || i7 == 3)) {
                    wtVar.d.setAlpha(f11);
                }
                wtVar.c(floatValue2 - f10);
                return;
            case 3:
                ((ry) this.f29121c).R0[this.f29120b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                y40 y40Var = (y40) this.f29121c;
                if (this.f29120b == y40Var.f42318u0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    y40Var.f42322x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                yp ypVar = (yp) this.f29121c;
                ypVar.getClass();
                fj0 fj0Var = (fj0) ypVar.d;
                fj0Var.f35121b.put(this.f29120b, (Float) valueAnimator.getAnimatedValue());
                fj0Var.d = true;
                fj0Var.f35120a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f29121c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f60558n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f29120b));
                fVar.f60560p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
