package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f29653a;
    public final t f29654b;
    public final k0 f29655c;

    public i0(k0 k0Var, t tVar, t tVar2) {
        this.f29655c = k0Var;
        this.f29653a = tVar;
        this.f29654b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f29655c;
        k0Var.K0 = null;
        this.f29653a.B = false;
        t tVar = k0Var.B;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.B);
                this.f29654b.e();
            }
            k0Var.B = null;
        }
    }
}
