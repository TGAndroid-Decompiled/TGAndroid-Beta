package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class mx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30776a;
    public final bg.c2 f30777b;
    public final int f30778c;

    public mx0(bg.c2 c2Var, int i10, int i11) {
        this.f30776a = i11;
        this.f30777b = c2Var;
        this.f30778c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30776a) {
            case 0:
                Float f9 = (Float) valueAnimator.getAnimatedValue();
                f9.getClass();
                ((ArrayList) this.f30777b.d).set(this.f30778c, f9);
                return;
            case 1:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f30777b.f2121e).set(this.f30778c, f10);
                return;
            case 2:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f30777b.f2122f).set(this.f30778c, f11);
                return;
            case 3:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f30777b.d).set(this.f30778c, f12);
                return;
            case 4:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f30777b.f2121e).set(this.f30778c, f13);
                return;
            default:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f30777b.f2122f).set(this.f30778c, f14);
                return;
        }
    }
}
