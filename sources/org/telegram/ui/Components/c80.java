package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c80 extends AnimatorListenerAdapter {
    public final int f25145a;
    public final d80 f25146b;

    public c80(d80 d80Var, int i10) {
        this.f25145a = i10;
        this.f25146b = d80Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25145a) {
            case 0:
                d80 d80Var = this.f25146b;
                d80Var.f25475e.f25901d0 = null;
                d80Var.requestLayout();
                return;
            default:
                d80 d80Var2 = this.f25146b;
                d80Var2.f25475e.f25901d0 = null;
                d80Var2.f25472a = false;
                return;
        }
    }
}
