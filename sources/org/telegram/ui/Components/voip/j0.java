package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f31991a;
    public final m0 f31992b;

    public j0(m0 m0Var, u uVar) {
        this.f31992b = m0Var;
        this.f31991a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31991a;
        if (uVar.getParent() != null) {
            this.f31992b.removeView(uVar);
            uVar.e();
        }
    }
}
