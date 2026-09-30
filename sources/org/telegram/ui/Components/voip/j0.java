package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29325a;
    public final m0 f29326b;

    public j0(m0 m0Var, u uVar) {
        this.f29326b = m0Var;
        this.f29325a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29325a;
        if (uVar.getParent() != null) {
            this.f29326b.removeView(uVar);
            uVar.e();
        }
    }
}
