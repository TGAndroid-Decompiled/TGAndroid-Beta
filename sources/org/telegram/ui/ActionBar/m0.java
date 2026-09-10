package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final int f18467a;
    public final w0 f18468b;

    public m0(w0 w0Var, int i10) {
        this.f18467a = i10;
        this.f18468b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18467a) {
            case 0:
                w0 w0Var = this.f18468b;
                w0Var.f18707s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f18468b.v = null;
                return;
        }
    }
}
