package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29473a;
    public final q2 f29474b;

    public p2(q2 q2Var, int i10) {
        this.f29473a = i10;
        this.f29474b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29473a) {
            case 0:
                this.f29474b.f29496b.setVisibility(8);
                return;
            default:
                this.f29474b.f29497c.setVisibility(8);
                return;
        }
    }
}
