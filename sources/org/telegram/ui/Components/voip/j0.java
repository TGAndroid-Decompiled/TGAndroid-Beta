package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29319a;
    public final m0 f29320b;

    public j0(m0 m0Var, u uVar) {
        this.f29320b = m0Var;
        this.f29319a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29319a;
        if (uVar.getParent() != null) {
            this.f29320b.removeView(uVar);
            uVar.e();
        }
    }
}
