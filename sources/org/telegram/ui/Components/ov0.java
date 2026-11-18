package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ov0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38176a;
    public final View f38177b;
    public final FrameLayout f38178c;

    public ov0(FrameLayout frameLayout, View view, int i7) {
        this.f38176a = i7;
        this.f38178c = frameLayout;
        this.f38177b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38176a) {
            case 0:
                pv0 pv0Var = (pv0) this.f38178c;
                pv0Var.f38569b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.invalidate();
                ((el0) this.f38177b).invalidate();
                return;
            default:
                ((g71) this.f38178c).B(this.f38177b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
