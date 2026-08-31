package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ex0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26658a;
    public final View f26659b;
    public final FrameLayout f26660c;

    public ex0(FrameLayout frameLayout, View view, int i10) {
        this.f26658a = i10;
        this.f26660c = frameLayout;
        this.f26659b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26658a) {
            case 0:
                gx0 gx0Var = (gx0) this.f26660c;
                gx0Var.f27311b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gx0Var.invalidate();
                ((qm0) this.f26659b).invalidate();
                return;
            default:
                ((m81) this.f26660c).E(this.f26659b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
