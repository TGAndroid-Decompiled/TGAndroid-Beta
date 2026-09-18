package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23401a;
    public final View f23402b;
    public final FrameLayout f23403c;

    public dx0(FrameLayout frameLayout, View view, int i10) {
        this.f23401a = i10;
        this.f23403c = frameLayout;
        this.f23402b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23401a) {
            case 0:
                ex0 ex0Var = (ex0) this.f23403c;
                ex0Var.f23685b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0Var.invalidate();
                ((jm0) this.f23402b).invalidate();
                return;
            default:
                ((j81) this.f23403c).F(this.f23402b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
