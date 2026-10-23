package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final h1 f31400a;

    public e1(h1 h1Var) {
        this.f31400a = h1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.f31400a;
        h1Var.f31448b.removeViewImmediate(h1Var.d);
        h1Var.f31450f.d.release();
        h1Var.v = null;
        h1Var.f31454w = true;
        h1Var.f31455x = false;
        h1Var.J = null;
        h1Var.H = false;
    }
}
