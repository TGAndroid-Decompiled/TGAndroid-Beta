package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class qv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39002a;
    public final View f39003b;
    public final FrameLayout f39004c;

    public qv0(FrameLayout frameLayout, View view, int i7) {
        this.f39002a = i7;
        this.f39004c = frameLayout;
        this.f39003b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39002a) {
            case 0:
                rv0 rv0Var = (rv0) this.f39004c;
                rv0Var.f39418b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rv0Var.invalidate();
                ((gl0) this.f39003b).invalidate();
                return;
            default:
                ((k71) this.f39004c).D(this.f39003b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
