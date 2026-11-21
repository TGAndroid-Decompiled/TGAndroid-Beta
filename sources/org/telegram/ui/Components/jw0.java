package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class jw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36706a;
    public final a8.b8 f36707b;
    public final int f36708c;

    public jw0(a8.b8 b8Var, int i7, int i10) {
        this.f36706a = i10;
        this.f36707b = b8Var;
        this.f36708c = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36706a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f36707b.d).set(this.f36708c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f36707b.f344e).set(this.f36708c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f36707b.f345f).set(this.f36708c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f36707b.d).set(this.f36708c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f36707b.f344e).set(this.f36708c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f36707b.f345f).set(this.f36708c, f15);
                return;
        }
    }
}
