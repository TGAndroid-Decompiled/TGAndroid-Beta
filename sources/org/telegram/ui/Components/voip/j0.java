package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f31993a;
    public final m0 f31994b;

    public j0(m0 m0Var, u uVar) {
        this.f31994b = m0Var;
        this.f31993a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31993a;
        if (uVar.getParent() != null) {
            this.f31994b.removeView(uVar);
            uVar.e();
        }
    }
}
