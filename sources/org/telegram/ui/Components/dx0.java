package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24385a;
    public final View f24386b;
    public final FrameLayout f24387c;

    public dx0(FrameLayout frameLayout, View view, int i10) {
        this.f24385a = i10;
        this.f24387c = frameLayout;
        this.f24386b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24385a) {
            case 0:
                fx0 fx0Var = (fx0) this.f24387c;
                fx0Var.f24970b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fx0Var.invalidate();
                ((pm0) this.f24386b).invalidate();
                return;
            default:
                ((l81) this.f24387c).E(this.f24386b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
