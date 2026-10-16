package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f29916a;
    public final t f29917b;
    public final l0 f29918c;

    public j0(l0 l0Var, t tVar, t tVar2) {
        this.f29918c = l0Var;
        this.f29916a = tVar;
        this.f29917b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f29918c;
        l0Var.N0 = null;
        this.f29916a.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                this.f29917b.e();
            }
            l0Var.E = null;
        }
    }
}
