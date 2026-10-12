package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ky0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27962a;
    public final View f27963b;
    public final FrameLayout f27964c;

    public ky0(FrameLayout frameLayout, View view, int i10) {
        this.f27962a = i10;
        this.f27964c = frameLayout;
        this.f27963b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27962a) {
            case 0:
                ly0 ly0Var = (ly0) this.f27964c;
                ly0Var.f28312b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ly0Var.invalidate();
                ((un0) this.f27963b).invalidate();
                return;
            default:
                ((u91) this.f27964c).E(this.f27963b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
