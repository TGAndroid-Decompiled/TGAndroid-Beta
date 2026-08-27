package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class i0 extends AnimatorListenerAdapter {

    public final t f33610a;

    public final t f33611b;

    public final k0 f33612c;

    public i0(k0 k0Var, t tVar, t tVar2) {
        this.f33612c = k0Var;
        this.f33610a = tVar;
        this.f33611b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f33612c;
        k0Var.J0 = null;
        this.f33610a.A = false;
        t tVar = k0Var.A;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.A);
                this.f33611b.e();
            }
            k0Var.A = null;
        }
    }
}
