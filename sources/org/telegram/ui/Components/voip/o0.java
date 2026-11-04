package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o0 extends AnimatorListenerAdapter {
    public final s0 f39498a;

    public o0(s0 s0Var) {
        this.f39498a = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s0 s0Var = this.f39498a;
        s0Var.f39592b.removeViewImmediate(s0Var.d);
        s0Var.f39596f.d.release();
        s0Var.f39600w = null;
        s0Var.f39601x = true;
        s0Var.f39602y = false;
        s0Var.K = null;
        s0Var.I = false;
    }
}
