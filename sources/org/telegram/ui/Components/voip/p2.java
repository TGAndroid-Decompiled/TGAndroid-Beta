package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32144a;
    public final q2 f32145b;

    public p2(q2 q2Var, int i10) {
        this.f32144a = i10;
        this.f32145b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32144a) {
            case 0:
                this.f32145b.f32168b.setVisibility(8);
                return;
            default:
                this.f32145b.f32169c.setVisibility(8);
                return;
        }
    }
}
