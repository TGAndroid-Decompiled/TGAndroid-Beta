package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f28546a;
    public final q0 f28547b;

    public g0(q0 q0Var, int i7) {
        this.f28546a = i7;
        this.f28547b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28546a) {
            case 0:
                q0 q0Var = this.f28547b;
                q0Var.f29519s.setVisibility(4);
                q0Var.f29524w = null;
                return;
            default:
                this.f28547b.f29524w = null;
                return;
        }
    }
}
