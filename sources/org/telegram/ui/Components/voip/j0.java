package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f33868a;
    public final t f33869b;
    public final l0 f33870c;

    public j0(l0 l0Var, t tVar, t tVar2) {
        this.f33870c = l0Var;
        this.f33868a = tVar;
        this.f33869b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f33870c;
        l0Var.N0 = null;
        this.f33868a.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                this.f33869b.e();
            }
            l0Var.E = null;
        }
    }
}
