package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class aw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33097a;
    public final a8.b8 f33098b;
    public final int f33099c;

    public aw0(a8.b8 b8Var, int i7, int i10) {
        this.f33097a = i10;
        this.f33098b = b8Var;
        this.f33099c = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33097a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f33098b.d).set(this.f33099c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f33098b.f344e).set(this.f33099c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f33098b.f345f).set(this.f33099c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f33098b.d).set(this.f33099c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f33098b.f344e).set(this.f33099c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f33098b.f345f).set(this.f33099c, f15);
                return;
        }
    }
}
