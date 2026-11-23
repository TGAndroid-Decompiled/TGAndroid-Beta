package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class rv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39352a;
    public final View f39353b;
    public final FrameLayout f39354c;

    public rv0(FrameLayout frameLayout, View view, int i7) {
        this.f39352a = i7;
        this.f39354c = frameLayout;
        this.f39353b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39352a) {
            case 0:
                sv0 sv0Var = (sv0) this.f39354c;
                sv0Var.f39697b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.invalidate();
                ((gl0) this.f39353b).invalidate();
                return;
            default:
                ((j71) this.f39354c).B(this.f39353b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
