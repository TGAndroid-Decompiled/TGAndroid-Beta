package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class sj implements ValueAnimator.AnimatorUpdateListener {
    public final int f28716a;
    public final int f28717b;
    public final float f28718c;
    public final FrameLayout d;

    public sj(FrameLayout frameLayout, int i10, float f10, int i11) {
        this.f28716a = i11;
        this.d = frameLayout;
        this.f28717b = i10;
        this.f28718c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28716a) {
            case 0:
                hk hkVar = (hk) this.d;
                vj vjVar = hkVar.f25434r;
                vj vjVar2 = hkVar.f25435s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f28717b;
                float f10 = this.f28718c;
                if (i10 == 1) {
                    vjVar.setTranslationX(f10 * floatValue);
                    vjVar.setAlpha(1.0f - floatValue);
                    vjVar.invalidate();
                    vjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    vjVar2.setScaleX(f11);
                    vjVar2.setScaleY(f11);
                    return;
                }
                vjVar2.setTranslationX(f10 * floatValue);
                vjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                vjVar2.invalidate();
                vjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                vjVar.setScaleX(f12);
                vjVar.setScaleY(f12);
                vjVar2.invalidate();
                return;
            default:
                qb0 qb0Var = (qb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i11 = (int) ((qb0Var.O * floatValue2) + (this.f28717b * f13));
                qb0Var.Q = i11;
                qb0Var.e((qb0Var.P * floatValue2) + (this.f28718c * f13), i11);
                return;
        }
    }
}
