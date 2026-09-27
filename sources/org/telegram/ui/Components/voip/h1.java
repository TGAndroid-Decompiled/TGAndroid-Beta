package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f29322a;

    public h1(k1 k1Var) {
        this.f29322a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f29322a;
        k1Var.f29366b.removeViewImmediate(k1Var.d);
        k1Var.f29368f.d.release();
        k1Var.v = null;
        k1Var.f29372w = true;
        k1Var.f29373x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
