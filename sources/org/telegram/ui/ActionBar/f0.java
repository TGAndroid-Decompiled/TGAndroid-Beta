package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f0 extends AnimatorListenerAdapter {
    public final int f27486a;
    public final q0 f27487b;

    public f0(q0 q0Var, int i3) {
        this.f27486a = i3;
        this.f27487b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27486a) {
            case 0:
                q0 q0Var = this.f27487b;
                q0Var.f28462s.setVisibility(4);
                q0Var.f28467w = null;
                return;
            default:
                this.f27487b.f28467w = null;
                return;
        }
    }
}
