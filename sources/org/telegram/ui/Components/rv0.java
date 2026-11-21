package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class rv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39343a;
    public final View f39344b;
    public final FrameLayout f39345c;

    public rv0(FrameLayout frameLayout, View view, int i7) {
        this.f39343a = i7;
        this.f39345c = frameLayout;
        this.f39344b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39343a) {
            case 0:
                sv0 sv0Var = (sv0) this.f39345c;
                sv0Var.f39705b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.invalidate();
                ((gl0) this.f39344b).invalidate();
                return;
            default:
                ((j71) this.f39345c).B(this.f39344b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
