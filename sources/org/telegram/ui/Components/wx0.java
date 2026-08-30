package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class wx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30433a;
    public final a9.a f30434b;
    public final int f30435c;

    public wx0(a9.a aVar, int i10, int i11) {
        this.f30433a = i11;
        this.f30434b = aVar;
        this.f30435c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30433a) {
            case 0:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                f10.getClass();
                ((ArrayList) this.f30434b.d).set(this.f30435c, f10);
                return;
            case 1:
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                f11.getClass();
                ((ArrayList) this.f30434b.e).set(this.f30435c, f11);
                return;
            case 2:
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                f12.getClass();
                ((ArrayList) this.f30434b.f146f).set(this.f30435c, f12);
                return;
            case 3:
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                f13.getClass();
                ((ArrayList) this.f30434b.d).set(this.f30435c, f13);
                return;
            case 4:
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                f14.getClass();
                ((ArrayList) this.f30434b.e).set(this.f30435c, f14);
                return;
            default:
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.getClass();
                ((ArrayList) this.f30434b.f146f).set(this.f30435c, f15);
                return;
        }
    }
}
