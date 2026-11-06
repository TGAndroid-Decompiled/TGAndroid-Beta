package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ev0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33355a;
    public final View f33356b;
    public final FrameLayout f33357c;

    public ev0(FrameLayout frameLayout, View view, int i7) {
        this.f33355a = i7;
        this.f33357c = frameLayout;
        this.f33356b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33355a) {
            case 0:
                fv0 fv0Var = (fv0) this.f33357c;
                fv0Var.f33640b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                ((rk0) this.f33356b).invalidate();
                return;
            default:
                ((v61) this.f33357c).F(this.f33356b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
