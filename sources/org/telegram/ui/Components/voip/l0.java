package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f31967a;
    public final m0 f31968b;

    public l0(m0 m0Var, u uVar) {
        this.f31968b = m0Var;
        this.f31967a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31967a;
        if (uVar.getParent() != null) {
            this.f31968b.removeView(uVar);
            uVar.e();
        }
    }
}
