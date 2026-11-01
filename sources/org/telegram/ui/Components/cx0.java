package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class cx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25290a;
    public final j2.f f25291b;
    public final int f25292c;

    public cx0(j2.f fVar, int i10, int i11) {
        this.f25290a = i11;
        this.f25291b = fVar;
        this.f25292c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25290a) {
            case 0:
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                f7.getClass();
                ((ArrayList) this.f25291b.d).set(this.f25292c, f7);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f25291b.e).set(this.f25292c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f25291b.f9351f).set(this.f25292c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f25291b.d).set(this.f25292c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f25291b.e).set(this.f25292c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f25291b.f9351f).set(this.f25292c, f14);
                return;
        }
    }
}
