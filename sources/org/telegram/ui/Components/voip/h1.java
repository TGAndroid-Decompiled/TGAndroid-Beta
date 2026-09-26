package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f29296a;

    public h1(k1 k1Var) {
        this.f29296a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f29296a;
        k1Var.f29340b.removeViewImmediate(k1Var.d);
        k1Var.f29342f.d.release();
        k1Var.v = null;
        k1Var.f29346w = true;
        k1Var.f29347x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
