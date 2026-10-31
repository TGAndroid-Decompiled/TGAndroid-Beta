package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final s0 f31573a;

    public p0(s0 s0Var) {
        this.f31573a = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s0 s0Var = this.f31573a;
        s0Var.f31648b.removeViewImmediate(s0Var.d);
        s0Var.f31650f.d.release();
        s0Var.f31654w = null;
        s0Var.f31655x = true;
        s0Var.f31656y = false;
        s0Var.J = null;
        s0Var.H = false;
    }
}
