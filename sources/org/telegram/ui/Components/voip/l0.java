package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final v f31772a;
    public final v f31773b;
    public final n0 f31774c;

    public l0(n0 n0Var, v vVar, v vVar2) {
        this.f31774c = n0Var;
        this.f31772a = vVar;
        this.f31773b = vVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f31774c;
        n0Var.N0 = null;
        this.f31772a.E = false;
        v vVar = n0Var.E;
        if (vVar != null) {
            if (vVar.getParent() != null) {
                n0Var.removeView(n0Var.E);
                this.f31773b.e();
            }
            n0Var.E = null;
        }
    }
}
