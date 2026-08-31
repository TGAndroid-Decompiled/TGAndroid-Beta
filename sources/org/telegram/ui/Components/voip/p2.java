package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f32260a;
    public final q2 f32261b;

    public p2(q2 q2Var, int i10) {
        this.f32260a = i10;
        this.f32261b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32260a) {
            case 0:
                this.f32261b.f32292b.setVisibility(8);
                return;
            default:
                this.f32261b.f32293c.setVisibility(8);
                return;
        }
    }
}
