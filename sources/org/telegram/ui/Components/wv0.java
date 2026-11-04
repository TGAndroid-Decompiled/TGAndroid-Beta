package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class wv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40153a;
    public final l2.e f40154b;
    public final int f40155c;

    public wv0(l2.e eVar, int i3, int i10) {
        this.f40153a = i10;
        this.f40154b = eVar;
        this.f40155c = i3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40153a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f40154b.d).set(this.f40155c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f40154b.f17692e).set(this.f40155c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f40154b.f17693f).set(this.f40155c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f40154b.d).set(this.f40155c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f40154b.f17692e).set(this.f40155c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f40154b.f17693f).set(this.f40155c, f15);
                return;
        }
    }
}
