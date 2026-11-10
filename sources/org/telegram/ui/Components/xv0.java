package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class xv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40405a;
    public final a8.b8 f40406b;
    public final int f40407c;

    public xv0(a8.b8 b8Var, int i7, int i10) {
        this.f40405a = i10;
        this.f40406b = b8Var;
        this.f40407c = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40405a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f40406b.d).set(this.f40407c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f40406b.f338e).set(this.f40407c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f40406b.f339f).set(this.f40407c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f40406b.d).set(this.f40407c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f40406b.f338e).set(this.f40407c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f40406b.f339f).set(this.f40407c, f15);
                return;
        }
    }
}
