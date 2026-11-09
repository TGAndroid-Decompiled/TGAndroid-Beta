package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class gv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34054a;
    public final View f34055b;
    public final FrameLayout f34056c;

    public gv0(FrameLayout frameLayout, View view, int i7) {
        this.f34054a = i7;
        this.f34056c = frameLayout;
        this.f34055b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34054a) {
            case 0:
                hv0 hv0Var = (hv0) this.f34056c;
                hv0Var.f34382b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hv0Var.invalidate();
                ((sk0) this.f34055b).invalidate();
                return;
            default:
                ((w61) this.f34056c).F(this.f34055b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
