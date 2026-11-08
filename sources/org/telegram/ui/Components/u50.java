package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u50 extends AnimatorListenerAdapter {
    public final int f38518a;
    public final w50 f38519b;

    public u50(w50 w50Var, int i7) {
        this.f38518a = i7;
        this.f38519b = w50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38518a) {
            case 0:
                w50 w50Var = this.f38519b;
                w50Var.f39815e.U1 = null;
                w50Var.requestLayout();
                return;
            default:
                w50 w50Var2 = this.f38519b;
                w50Var2.f39815e.U1 = null;
                w50Var2.f39812a = false;
                return;
        }
    }
}
