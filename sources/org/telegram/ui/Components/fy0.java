package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class fy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26533a;
    public final View f26534b;
    public final FrameLayout f26535c;

    public fy0(FrameLayout frameLayout, View view, int i10) {
        this.f26533a = i10;
        this.f26535c = frameLayout;
        this.f26534b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26533a) {
            case 0:
                gy0 gy0Var = (gy0) this.f26535c;
                gy0Var.f26867b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                ((pn0) this.f26534b).invalidate();
                return;
            default:
                ((p91) this.f26535c).E(this.f26534b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
