package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ay0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24874a;
    public final View f24875b;
    public final FrameLayout f24876c;

    public ay0(FrameLayout frameLayout, View view, int i10) {
        this.f24874a = i10;
        this.f24876c = frameLayout;
        this.f24875b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24874a) {
            case 0:
                by0 by0Var = (by0) this.f24876c;
                by0Var.f25166b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by0Var.invalidate();
                ((kn0) this.f24875b).invalidate();
                return;
            default:
                ((l91) this.f24876c).E(this.f24875b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
