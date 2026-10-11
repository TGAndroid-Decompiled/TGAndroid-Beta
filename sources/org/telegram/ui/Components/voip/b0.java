package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final v f31906a;
    public final n0 f31907b;

    public b0(n0 n0Var, v vVar) {
        this.f31907b = n0Var;
        this.f31906a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f31907b;
        n0Var.N0 = null;
        this.f31906a.E = false;
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
