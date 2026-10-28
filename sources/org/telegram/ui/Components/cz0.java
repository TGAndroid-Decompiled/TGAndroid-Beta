package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class cz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27297a;
    public final aa.m0 f27298b;
    public final int f27299c;

    public cz0(aa.m0 m0Var, int i10, int i11) {
        this.f27297a = i11;
        this.f27298b = m0Var;
        this.f27299c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27297a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f27298b.d).set(this.f27299c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f27298b.e).set(this.f27299c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f27298b.f1153f).set(this.f27299c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f27298b.d).set(this.f27299c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f27298b.e).set(this.f27299c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f27298b.f1153f).set(this.f27299c, f14);
                return;
        }
    }
}
