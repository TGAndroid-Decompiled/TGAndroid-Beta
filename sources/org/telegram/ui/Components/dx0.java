package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24394a;
    public final View f24395b;
    public final FrameLayout f24396c;

    public dx0(FrameLayout frameLayout, View view, int i10) {
        this.f24394a = i10;
        this.f24396c = frameLayout;
        this.f24395b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24394a) {
            case 0:
                fx0 fx0Var = (fx0) this.f24396c;
                fx0Var.f24976b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fx0Var.invalidate();
                ((om0) this.f24395b).invalidate();
                return;
            default:
                ((l81) this.f24396c).E(this.f24395b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
