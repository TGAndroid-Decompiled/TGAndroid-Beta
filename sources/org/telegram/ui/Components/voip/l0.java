package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f31787a;
    public final u f31788b;
    public final n0 f31789c;

    public l0(n0 n0Var, u uVar, u uVar2) {
        this.f31789c = n0Var;
        this.f31787a = uVar;
        this.f31788b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f31789c;
        n0Var.N0 = null;
        this.f31787a.E = false;
        u uVar = n0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                n0Var.removeView(n0Var.E);
                this.f31788b.e();
            }
            n0Var.E = null;
        }
    }
}
