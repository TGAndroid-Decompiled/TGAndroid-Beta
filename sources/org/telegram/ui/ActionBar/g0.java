package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f28965a;
    public final q0 f28966b;

    public g0(q0 q0Var, int i7) {
        this.f28965a = i7;
        this.f28966b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28965a) {
            case 0:
                q0 q0Var = this.f28966b;
                q0Var.f29921s.setVisibility(4);
                q0Var.f29926w = null;
                return;
            default:
                this.f28966b.f29926w = null;
                return;
        }
    }
}
