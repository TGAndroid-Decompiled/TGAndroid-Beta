package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

public final class mw0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f30761a;

    public final View f30762b;

    public final FrameLayout f30763c;

    public mw0(FrameLayout frameLayout, View view, int i10) {
        this.f30761a = i10;
        this.f30763c = frameLayout;
        this.f30762b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30761a) {
            case 0:
                nw0 nw0Var = (nw0) this.f30763c;
                nw0Var.f31044b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nw0Var.invalidate();
                ((vl0) this.f30762b).invalidate();
                break;
            default:
                ((p71) this.f30763c).E(this.f30762b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
