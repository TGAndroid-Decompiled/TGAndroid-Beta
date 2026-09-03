package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n0 extends AnimatorListenerAdapter {
    public final int f20451a;
    public final w0 f20452b;

    public n0(w0 w0Var, int i10) {
        this.f20451a = i10;
        this.f20452b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20451a) {
            case 0:
                w0 w0Var = this.f20452b;
                w0Var.f20645s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f20452b.v = null;
                return;
        }
    }
}
