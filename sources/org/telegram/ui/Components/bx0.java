package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24909a;
    public final j2.f f24910b;
    public final int f24911c;

    public bx0(j2.f fVar, int i10, int i11) {
        this.f24909a = i11;
        this.f24910b = fVar;
        this.f24911c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24909a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f24910b.d).set(this.f24911c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f24910b.e).set(this.f24911c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f24910b.f9350f).set(this.f24911c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f24910b.d).set(this.f24911c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f24910b.e).set(this.f24911c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f24910b.f9350f).set(this.f24911c, f14);
                return;
        }
    }
}
