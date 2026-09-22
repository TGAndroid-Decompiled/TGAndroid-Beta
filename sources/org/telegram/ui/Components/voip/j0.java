package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f28998a;
    public final m0 f28999b;

    public j0(m0 m0Var, u uVar) {
        this.f28999b = m0Var;
        this.f28998a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f28998a;
        if (uVar.getParent() != null) {
            this.f28999b.removeView(uVar);
            uVar.e();
        }
    }
}
