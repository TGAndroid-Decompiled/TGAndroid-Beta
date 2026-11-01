package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final t0 f31660a;

    public q0(t0 t0Var) {
        this.f31660a = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t0 t0Var = this.f31660a;
        t0Var.f31727b.removeViewImmediate(t0Var.d);
        t0Var.f31729f.d.release();
        t0Var.f31733w = null;
        t0Var.f31734x = true;
        t0Var.f31735y = false;
        t0Var.J = null;
        t0Var.H = false;
    }
}
