package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29404a;
    public final m0 f29405b;

    public j0(m0 m0Var, u uVar) {
        this.f29405b = m0Var;
        this.f29404a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29404a;
        if (uVar.getParent() != null) {
            this.f29405b.removeView(uVar);
            uVar.e();
        }
    }
}
