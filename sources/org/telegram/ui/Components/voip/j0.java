package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f31917a;
    public final m0 f31918b;

    public j0(m0 m0Var, u uVar) {
        this.f31918b = m0Var;
        this.f31917a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31917a;
        if (uVar.getParent() != null) {
            this.f31918b.removeView(uVar);
            uVar.e();
        }
    }
}
