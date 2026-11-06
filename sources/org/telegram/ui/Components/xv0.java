package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class xv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40419a;
    public final a8.b8 f40420b;
    public final int f40421c;

    public xv0(a8.b8 b8Var, int i7, int i10) {
        this.f40419a = i10;
        this.f40420b = b8Var;
        this.f40421c = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40419a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f40420b.d).set(this.f40421c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f40420b.f338e).set(this.f40421c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f40420b.f339f).set(this.f40421c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f40420b.d).set(this.f40421c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f40420b.f338e).set(this.f40421c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f40420b.f339f).set(this.f40421c, f15);
                return;
        }
    }
}
