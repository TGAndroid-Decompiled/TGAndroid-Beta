package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29328a;
    public final m0 f29329b;

    public j0(m0 m0Var, u uVar) {
        this.f29329b = m0Var;
        this.f29328a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29328a;
        if (uVar.getParent() != null) {
            this.f29329b.removeView(uVar);
            uVar.e();
        }
    }
}
