package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.yt;
import org.telegram.ui.yp;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29013a;
    public final int f29014b;
    public final Object f29015c;

    public j2(Object obj, int i7, int i10) {
        this.f29013a = i10;
        this.f29015c = obj;
        this.f29014b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f29013a) {
            case 0:
                w2 w2Var = (w2) this.f29015c;
                w2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2Var.C0(this.f29014b, intValue, intValue);
                return;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f29015c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == this.f29014b) {
                    r1Var.setSelectedBackgroundProgress(floatValue);
                    return;
                }
                return;
            case 2:
                yt ytVar = (yt) this.f29015c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ytVar.d.setTranslationY(floatValue2);
                int i10 = this.f29014b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ytVar.S = f11;
                if (i10 > 0 && ((i7 = ytVar.M) == 2 || i7 == 3)) {
                    ytVar.d.setAlpha(f11);
                }
                ytVar.c(floatValue2 - f10);
                return;
            case 3:
                ((ty) this.f29015c).R0[this.f29014b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                b50 b50Var = (b50) this.f29015c;
                if (this.f29014b == b50Var.f33737u0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    b50Var.f33741x.setRotationY(floatValue3 * 180.0f);
                    return;
                }
                return;
            case 5:
                yp ypVar = (yp) this.f29015c;
                ypVar.getClass();
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.f35874b.put(this.f29014b, (Float) valueAnimator.getAnimatedValue());
                hj0Var.d = true;
                hj0Var.f35873a.invalidate();
                return;
            default:
                xh.f fVar = (xh.f) this.f29015c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f60568n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.f29014b));
                fVar.f60570p = true;
                fVar.invalidateSelf();
                return;
        }
    }
}
