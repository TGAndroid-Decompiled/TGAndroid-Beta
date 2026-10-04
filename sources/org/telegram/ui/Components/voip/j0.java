package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f31918a;
    public final m0 f31919b;

    public j0(m0 m0Var, u uVar) {
        this.f31919b = m0Var;
        this.f31918a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31918a;
        if (uVar.getParent() != null) {
            this.f31919b.removeView(uVar);
            uVar.e();
        }
    }
}
