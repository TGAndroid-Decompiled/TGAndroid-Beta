package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ay0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23636a;
    public final View f23637b;
    public final FrameLayout f23638c;

    public ay0(FrameLayout frameLayout, View view, int i10) {
        this.f23636a = i10;
        this.f23638c = frameLayout;
        this.f23637b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23636a) {
            case 0:
                by0 by0Var = (by0) this.f23638c;
                by0Var.f23872b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by0Var.invalidate();
                ((kn0) this.f23637b).invalidate();
                return;
            default:
                ((k91) this.f23638c).E(this.f23637b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
