package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32077a;
    public final q2 f32078b;

    public p2(q2 q2Var, int i10) {
        this.f32077a = i10;
        this.f32078b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32077a) {
            case 0:
                this.f32078b.f32101b.setVisibility(8);
                return;
            default:
                this.f32078b.f32102c.setVisibility(8);
                return;
        }
    }
}
