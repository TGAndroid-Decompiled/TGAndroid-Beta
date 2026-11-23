package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class jw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36700a;
    public final a8.b8 f36701b;
    public final int f36702c;

    public jw0(a8.b8 b8Var, int i7, int i10) {
        this.f36700a = i10;
        this.f36701b = b8Var;
        this.f36702c = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36700a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f36701b.d).set(this.f36702c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f36701b.f344e).set(this.f36702c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f36701b.f345f).set(this.f36702c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f36701b.d).set(this.f36702c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f36701b.f344e).set(this.f36702c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f36701b.f345f).set(this.f36702c, f15);
                return;
        }
    }
}
