package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class vx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31930a;
    public final View f31931b;
    public final FrameLayout f31932c;

    public vx0(FrameLayout frameLayout, View view, int i10) {
        this.f31930a = i10;
        this.f31932c = frameLayout;
        this.f31931b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31930a) {
            case 0:
                wx0 wx0Var = (wx0) this.f31932c;
                wx0Var.f32237b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.invalidate();
                ((gn0) this.f31931b).invalidate();
                return;
            default:
                ((c91) this.f31932c).E(this.f31931b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
