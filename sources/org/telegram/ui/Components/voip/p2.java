package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32265a;
    public final q2 f32266b;

    public p2(q2 q2Var, int i10) {
        this.f32265a = i10;
        this.f32266b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32265a) {
            case 0:
                this.f32266b.f32297b.setVisibility(8);
                return;
            default:
                this.f32266b.f32298c.setVisibility(8);
                return;
        }
    }
}
