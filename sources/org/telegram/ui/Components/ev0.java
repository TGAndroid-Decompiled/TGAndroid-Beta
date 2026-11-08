package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ev0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33387a;
    public final View f33388b;
    public final FrameLayout f33389c;

    public ev0(FrameLayout frameLayout, View view, int i7) {
        this.f33387a = i7;
        this.f33389c = frameLayout;
        this.f33388b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33387a) {
            case 0:
                fv0 fv0Var = (fv0) this.f33389c;
                fv0Var.f33649b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                ((rk0) this.f33388b).invalidate();
                return;
            default:
                ((v61) this.f33389c).F(this.f33388b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
