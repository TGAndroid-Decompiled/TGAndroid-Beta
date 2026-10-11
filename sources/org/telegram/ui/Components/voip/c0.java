package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final n0 f31984a;

    public c0(n0 n0Var) {
        this.f31984a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f31984a;
        n0Var.N0 = null;
        n0Var.f32209y.E = false;
        v vVar = n0Var.E;
        if (vVar != null) {
            if (vVar.getParent() != null) {
                n0Var.removeView(n0Var.E);
                n0Var.E.e();
            }
            n0Var.E = null;
        }
    }
}
