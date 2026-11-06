package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u50 extends AnimatorListenerAdapter {
    public final int f38502a;
    public final w50 f38503b;

    public u50(w50 w50Var, int i7) {
        this.f38502a = i7;
        this.f38503b = w50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38502a) {
            case 0:
                w50 w50Var = this.f38503b;
                w50Var.f39867e.U1 = null;
                w50Var.requestLayout();
                return;
            default:
                w50 w50Var2 = this.f38503b;
                w50Var2.f39867e.U1 = null;
                w50Var2.f39864a = false;
                return;
        }
    }
}
