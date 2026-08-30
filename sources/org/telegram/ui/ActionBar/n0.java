package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n0 extends AnimatorListenerAdapter {
    public final int f20476a;
    public final w0 f20477b;

    public n0(w0 w0Var, int i10) {
        this.f20476a = i10;
        this.f20477b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20476a) {
            case 0:
                w0 w0Var = this.f20477b;
                w0Var.f20670s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f20477b.v = null;
                return;
        }
    }
}
