package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23398a;
    public final View f23399b;
    public final FrameLayout f23400c;

    public dx0(FrameLayout frameLayout, View view, int i10) {
        this.f23398a = i10;
        this.f23400c = frameLayout;
        this.f23399b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23398a) {
            case 0:
                ex0 ex0Var = (ex0) this.f23400c;
                ex0Var.f23682b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0Var.invalidate();
                ((jm0) this.f23399b).invalidate();
                return;
            default:
                ((j81) this.f23400c).F(this.f23399b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
