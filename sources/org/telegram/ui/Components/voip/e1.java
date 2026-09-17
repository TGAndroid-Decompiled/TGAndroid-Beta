package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final h1 f31469a;

    public e1(h1 h1Var) {
        this.f31469a = h1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.f31469a;
        h1Var.f31520b.removeViewImmediate(h1Var.d);
        h1Var.f31523f.d.release();
        h1Var.v = null;
        h1Var.f31527w = true;
        h1Var.f31528x = false;
        h1Var.J = null;
        h1Var.H = false;
    }
}
