package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final int f22820a;
    public final w0 f22821b;

    public l0(w0 w0Var, int i10) {
        this.f22820a = i10;
        this.f22821b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22820a) {
            case 0:
                w0 w0Var = this.f22821b;
                w0Var.f23195s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f22821b.v = null;
                return;
        }
    }
}
