package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class xx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33196a;
    public final a9.a f33197b;
    public final int f33198c;

    public xx0(a9.a aVar, int i10, int i11) {
        this.f33196a = i11;
        this.f33197b = aVar;
        this.f33198c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33196a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f33197b.d).set(this.f33198c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f33197b.f158e).set(this.f33198c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f33197b.f159f).set(this.f33198c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f33197b.d).set(this.f33198c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f33197b.f158e).set(this.f33198c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f33197b.f159f).set(this.f33198c, f15);
                return;
        }
    }
}
