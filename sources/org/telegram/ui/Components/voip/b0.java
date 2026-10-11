package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final v f31970a;
    public final n0 f31971b;

    public b0(n0 n0Var, v vVar) {
        this.f31971b = n0Var;
        this.f31970a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f31971b;
        n0Var.N0 = null;
        this.f31970a.E = false;
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
