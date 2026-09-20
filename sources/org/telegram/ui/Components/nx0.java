package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class nx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26746a;
    public final View f26747b;
    public final FrameLayout f26748c;

    public nx0(FrameLayout frameLayout, View view, int i10) {
        this.f26746a = i10;
        this.f26748c = frameLayout;
        this.f26747b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26746a) {
            case 0:
                ox0 ox0Var = (ox0) this.f26748c;
                ox0Var.f27060b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ox0Var.invalidate();
                ((um0) this.f26747b).invalidate();
                return;
            default:
                ((x81) this.f26748c).F(this.f26747b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
