package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ev0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33336a;
    public final View f33337b;
    public final FrameLayout f33338c;

    public ev0(FrameLayout frameLayout, View view, int i7) {
        this.f33336a = i7;
        this.f33338c = frameLayout;
        this.f33337b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33336a) {
            case 0:
                fv0 fv0Var = (fv0) this.f33338c;
                fv0Var.f33630b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                ((rk0) this.f33337b).invalidate();
                return;
            default:
                ((u61) this.f33338c).F(this.f33337b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
