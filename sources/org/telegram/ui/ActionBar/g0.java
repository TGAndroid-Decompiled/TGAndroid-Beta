package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f28934a;
    public final q0 f28935b;

    public g0(q0 q0Var, int i7) {
        this.f28934a = i7;
        this.f28935b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28934a) {
            case 0:
                q0 q0Var = this.f28935b;
                q0Var.f29890s.setVisibility(4);
                q0Var.f29895w = null;
                return;
            default:
                this.f28935b.f29895w = null;
                return;
        }
    }
}
