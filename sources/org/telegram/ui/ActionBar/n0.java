package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n0 extends AnimatorListenerAdapter {
    public final int f23695a;
    public final w0 f23696b;

    public n0(w0 w0Var, int i10) {
        this.f23695a = i10;
        this.f23696b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23695a) {
            case 0:
                w0 w0Var = this.f23696b;
                w0Var.f23936s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f23696b.v = null;
                return;
        }
    }
}
