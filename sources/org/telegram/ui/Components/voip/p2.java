package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29463a;
    public final q2 f29464b;

    public p2(q2 q2Var, int i10) {
        this.f29463a = i10;
        this.f29464b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29463a) {
            case 0:
                this.f29464b.f29486b.setVisibility(8);
                return;
            default:
                this.f29464b.f29487c.setVisibility(8);
                return;
        }
    }
}
