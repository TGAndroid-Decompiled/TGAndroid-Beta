package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class yx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33364a;
    public final View f33365b;
    public final FrameLayout f33366c;

    public yx0(FrameLayout frameLayout, View view, int i10) {
        this.f33364a = i10;
        this.f33366c = frameLayout;
        this.f33365b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33364a) {
            case 0:
                zx0 zx0Var = (zx0) this.f33366c;
                zx0Var.f33662b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zx0Var.invalidate();
                ((an0) this.f33365b).invalidate();
                return;
            default:
                ((h91) this.f33366c).F(this.f33365b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
