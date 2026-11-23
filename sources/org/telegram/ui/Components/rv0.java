package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class rv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39353a;
    public final View f39354b;
    public final FrameLayout f39355c;

    public rv0(FrameLayout frameLayout, View view, int i7) {
        this.f39353a = i7;
        this.f39355c = frameLayout;
        this.f39354b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39353a) {
            case 0:
                sv0 sv0Var = (sv0) this.f39355c;
                sv0Var.f39698b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.invalidate();
                ((gl0) this.f39354b).invalidate();
                return;
            default:
                ((j71) this.f39355c).B(this.f39354b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
