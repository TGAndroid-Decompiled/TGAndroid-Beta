package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final h1 f31495a;

    public e1(h1 h1Var) {
        this.f31495a = h1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.f31495a;
        h1Var.f31546b.removeViewImmediate(h1Var.d);
        h1Var.f31549f.d.release();
        h1Var.v = null;
        h1Var.f31553w = true;
        h1Var.f31554x = false;
        h1Var.J = null;
        h1Var.H = false;
    }
}
