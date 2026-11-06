package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u50 extends AnimatorListenerAdapter {
    public final int f38527a;
    public final w50 f38528b;

    public u50(w50 w50Var, int i7) {
        this.f38527a = i7;
        this.f38528b = w50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38527a) {
            case 0:
                w50 w50Var = this.f38528b;
                w50Var.f39859e.U1 = null;
                w50Var.requestLayout();
                return;
            default:
                w50 w50Var2 = this.f38528b;
                w50Var2.f39859e.U1 = null;
                w50Var2.f39856a = false;
                return;
        }
    }
}
