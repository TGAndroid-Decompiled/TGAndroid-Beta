package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class iw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36177a;
    public final a8.b8 f36178b;
    public final int f36179c;

    public iw0(a8.b8 b8Var, int i7, int i10) {
        this.f36177a = i10;
        this.f36178b = b8Var;
        this.f36179c = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36177a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f36178b.d).set(this.f36179c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f36178b.f344e).set(this.f36179c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f36178b.f345f).set(this.f36179c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f36178b.d).set(this.f36179c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f36178b.f344e).set(this.f36179c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f36178b.f345f).set(this.f36179c, f15);
                return;
        }
    }
}
