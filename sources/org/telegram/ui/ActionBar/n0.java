package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n0 extends AnimatorListenerAdapter {
    public final int f22156a;
    public final w0 f22157b;

    public n0(w0 w0Var, int i10) {
        this.f22156a = i10;
        this.f22157b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22156a) {
            case 0:
                w0 w0Var = this.f22157b;
                w0Var.f22368s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f22157b.v = null;
                return;
        }
    }
}
