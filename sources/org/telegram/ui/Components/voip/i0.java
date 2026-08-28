package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f33560a;
    public final t f33561b;
    public final k0 f33562c;

    public i0(k0 k0Var, t tVar, t tVar2) {
        this.f33562c = k0Var;
        this.f33560a = tVar;
        this.f33561b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f33562c;
        k0Var.J0 = null;
        this.f33560a.A = false;
        t tVar = k0Var.A;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.A);
                this.f33561b.e();
            }
            k0Var.A = null;
        }
    }
}
