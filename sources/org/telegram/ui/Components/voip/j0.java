package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f28978a;
    public final m0 f28979b;

    public j0(m0 m0Var, u uVar) {
        this.f28979b = m0Var;
        this.f28978a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f28978a;
        if (uVar.getParent() != null) {
            this.f28979b.removeView(uVar);
            uVar.e();
        }
    }
}
