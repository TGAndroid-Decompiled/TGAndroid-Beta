package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f29681a;
    public final t f29682b;
    public final k0 f29683c;

    public i0(k0 k0Var, t tVar, t tVar2) {
        this.f29683c = k0Var;
        this.f29681a = tVar;
        this.f29682b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f29683c;
        k0Var.K0 = null;
        this.f29681a.B = false;
        t tVar = k0Var.B;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.B);
                this.f29682b.e();
            }
            k0Var.B = null;
        }
    }
}
