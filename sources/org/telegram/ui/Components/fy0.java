package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class fy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26582a;
    public final View f26583b;
    public final FrameLayout f26584c;

    public fy0(FrameLayout frameLayout, View view, int i10) {
        this.f26582a = i10;
        this.f26584c = frameLayout;
        this.f26583b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26582a) {
            case 0:
                gy0 gy0Var = (gy0) this.f26584c;
                gy0Var.f26896b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                ((pn0) this.f26583b).invalidate();
                return;
            default:
                ((p91) this.f26584c).E(this.f26583b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
