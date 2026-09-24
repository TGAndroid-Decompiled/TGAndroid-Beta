package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29398a;
    public final m0 f29399b;

    public j0(m0 m0Var, u uVar) {
        this.f29399b = m0Var;
        this.f29398a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29398a;
        if (uVar.getParent() != null) {
            this.f29399b.removeView(uVar);
            uVar.e();
        }
    }
}
