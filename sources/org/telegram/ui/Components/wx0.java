package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class wx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32224a;
    public final View f32225b;
    public final FrameLayout f32226c;

    public wx0(FrameLayout frameLayout, View view, int i10) {
        this.f32224a = i10;
        this.f32226c = frameLayout;
        this.f32225b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32224a) {
            case 0:
                xx0 xx0Var = (xx0) this.f32226c;
                xx0Var.f32470b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var.invalidate();
                ((gn0) this.f32225b).invalidate();
                return;
            default:
                ((d91) this.f32226c).E(this.f32225b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
