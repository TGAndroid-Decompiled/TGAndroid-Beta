package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29407a;
    public final m0 f29408b;

    public j0(m0 m0Var, u uVar) {
        this.f29408b = m0Var;
        this.f29407a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29407a;
        if (uVar.getParent() != null) {
            this.f29408b.removeView(uVar);
            uVar.e();
        }
    }
}
