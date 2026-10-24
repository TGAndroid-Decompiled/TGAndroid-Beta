package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ux0 extends AnimatorListenerAdapter {
    public final int f31237a;
    public final vx0 f31238b;

    public ux0(vx0 vx0Var, int i10) {
        this.f31237a = i10;
        this.f31238b = vx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31237a) {
            case 0:
                this.f31238b.f32072s.setVisibility(8);
                return;
            case 1:
                this.f31238b.f32072s.setVisibility(8);
                return;
            default:
                this.f31238b.f32072s.setVisibility(8);
                return;
        }
    }
}
