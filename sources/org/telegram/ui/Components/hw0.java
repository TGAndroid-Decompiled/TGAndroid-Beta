package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class hw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35997a;
    public final a8.b8 f35998b;
    public final int f35999c;

    public hw0(a8.b8 b8Var, int i7, int i10) {
        this.f35997a = i10;
        this.f35998b = b8Var;
        this.f35999c = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35997a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f35998b.d).set(this.f35999c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f35998b.f344e).set(this.f35999c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f35998b.f345f).set(this.f35999c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f35998b.d).set(this.f35999c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f35998b.f344e).set(this.f35999c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f35998b.f345f).set(this.f35999c, f15);
                return;
        }
    }
}
