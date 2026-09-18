package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f28981a;
    public final m0 f28982b;

    public j0(m0 m0Var, u uVar) {
        this.f28982b = m0Var;
        this.f28981a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f28981a;
        if (uVar.getParent() != null) {
            this.f28982b.removeView(uVar);
            uVar.e();
        }
    }
}
