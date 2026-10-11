package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class gy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26841a;
    public final View f26842b;
    public final FrameLayout f26843c;

    public gy0(FrameLayout frameLayout, View view, int i10) {
        this.f26841a = i10;
        this.f26843c = frameLayout;
        this.f26842b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26841a) {
            case 0:
                hy0 hy0Var = (hy0) this.f26843c;
                hy0Var.f27095b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hy0Var.invalidate();
                ((qn0) this.f26842b).invalidate();
                return;
            default:
                ((q91) this.f26843c).E(this.f26842b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
