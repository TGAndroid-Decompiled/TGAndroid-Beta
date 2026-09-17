package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final int f19395a;
    public final w0 f19396b;

    public m0(w0 w0Var, int i10) {
        this.f19395a = i10;
        this.f19396b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19395a) {
            case 0:
                w0 w0Var = this.f19396b;
                w0Var.f19626s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f19396b.v = null;
                return;
        }
    }
}
