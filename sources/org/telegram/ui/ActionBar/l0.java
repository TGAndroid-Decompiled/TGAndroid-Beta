package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final int f22822a;
    public final w0 f22823b;

    public l0(w0 w0Var, int i10) {
        this.f22822a = i10;
        this.f22823b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22822a) {
            case 0:
                w0 w0Var = this.f22823b;
                w0Var.f23197s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f22823b.v = null;
                return;
        }
    }
}
