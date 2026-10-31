package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k60 extends AnimatorListenerAdapter {
    public final int f27644a;
    public final l60 f27645b;

    public k60(l60 l60Var, int i10) {
        this.f27644a = i10;
        this.f27645b = l60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27644a) {
            case 0:
                l60 l60Var = this.f27645b;
                l60Var.e.U1 = null;
                l60Var.requestLayout();
                return;
            default:
                l60 l60Var2 = this.f27645b;
                l60Var2.e.U1 = null;
                l60Var2.f28020a = false;
                return;
        }
    }
}
