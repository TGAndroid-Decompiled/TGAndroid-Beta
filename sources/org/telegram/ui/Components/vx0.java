package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class vx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31923a;
    public final View f31924b;
    public final FrameLayout f31925c;

    public vx0(FrameLayout frameLayout, View view, int i10) {
        this.f31923a = i10;
        this.f31925c = frameLayout;
        this.f31924b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31923a) {
            case 0:
                wx0 wx0Var = (wx0) this.f31925c;
                wx0Var.f32230b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.invalidate();
                ((gn0) this.f31924b).invalidate();
                return;
            default:
                ((c91) this.f31925c).E(this.f31924b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
