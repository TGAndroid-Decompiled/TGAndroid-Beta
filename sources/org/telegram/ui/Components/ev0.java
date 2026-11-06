package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ev0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33340a;
    public final View f33341b;
    public final FrameLayout f33342c;

    public ev0(FrameLayout frameLayout, View view, int i7) {
        this.f33340a = i7;
        this.f33342c = frameLayout;
        this.f33341b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33340a) {
            case 0:
                fv0 fv0Var = (fv0) this.f33342c;
                fv0Var.f33686b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                ((rk0) this.f33341b).invalidate();
                return;
            default:
                ((p61) this.f33342c).F(this.f33341b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
