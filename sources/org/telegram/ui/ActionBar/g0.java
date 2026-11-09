package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f27478a;
    public final r0 f27479b;

    public g0(r0 r0Var, int i7) {
        this.f27478a = i7;
        this.f27479b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27478a) {
            case 0:
                r0 r0Var = this.f27479b;
                r0Var.f28447s.setVisibility(4);
                r0Var.f28452w = null;
                return;
            default:
                this.f27479b.f28452w = null;
                return;
        }
    }
}
