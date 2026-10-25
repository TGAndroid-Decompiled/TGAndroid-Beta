package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class bz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27003a;
    public final aa.m0 f27004b;
    public final int f27005c;

    public bz0(aa.m0 m0Var, int i10, int i11) {
        this.f27003a = i11;
        this.f27004b = m0Var;
        this.f27005c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27003a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f27004b.d).set(this.f27005c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f27004b.e).set(this.f27005c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f27004b.f1153f).set(this.f27005c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f27004b.d).set(this.f27005c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f27004b.e).set(this.f27005c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f27004b.f1153f).set(this.f27005c, f14);
                return;
        }
    }
}
