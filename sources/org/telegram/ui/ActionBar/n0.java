package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n0 extends AnimatorListenerAdapter {
    public final int f22154a;
    public final w0 f22155b;

    public n0(w0 w0Var, int i10) {
        this.f22154a = i10;
        this.f22155b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22154a) {
            case 0:
                w0 w0Var = this.f22155b;
                w0Var.f22366s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f22155b.v = null;
                return;
        }
    }
}
