package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29408a;
    public final m0 f29409b;

    public j0(m0 m0Var, u uVar) {
        this.f29409b = m0Var;
        this.f29408a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29408a;
        if (uVar.getParent() != null) {
            this.f29409b.removeView(uVar);
            uVar.e();
        }
    }
}
