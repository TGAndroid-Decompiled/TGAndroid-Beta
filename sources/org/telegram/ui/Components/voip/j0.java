package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29329a;
    public final m0 f29330b;

    public j0(m0 m0Var, u uVar) {
        this.f29330b = m0Var;
        this.f29329a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29329a;
        if (uVar.getParent() != null) {
            this.f29330b.removeView(uVar);
            uVar.e();
        }
    }
}
