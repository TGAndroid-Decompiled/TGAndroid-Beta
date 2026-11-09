package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v50 extends AnimatorListenerAdapter {
    public final int f38954a;
    public final x50 f38955b;

    public v50(x50 x50Var, int i7) {
        this.f38954a = i7;
        this.f38955b = x50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38954a) {
            case 0:
                x50 x50Var = this.f38955b;
                x50Var.f40303e.U1 = null;
                x50Var.requestLayout();
                return;
            default:
                x50 x50Var2 = this.f38955b;
                x50Var2.f40303e.U1 = null;
                x50Var2.f40300a = false;
                return;
        }
    }
}
