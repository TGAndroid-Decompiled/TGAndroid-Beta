package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22857a;
    public final View f22858b;
    public final FrameLayout f22859c;

    public bx0(FrameLayout frameLayout, View view, int i10) {
        this.f22857a = i10;
        this.f22859c = frameLayout;
        this.f22858b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22857a) {
            case 0:
                cx0 cx0Var = (cx0) this.f22859c;
                cx0Var.f23118b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.invalidate();
                ((jm0) this.f22858b).invalidate();
                return;
            default:
                ((h81) this.f22859c).E(this.f22858b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
