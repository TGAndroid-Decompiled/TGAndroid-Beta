package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29001a;
    public final m0 f29002b;

    public j0(m0 m0Var, u uVar) {
        this.f29002b = m0Var;
        this.f29001a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29001a;
        if (uVar.getParent() != null) {
            this.f29002b.removeView(uVar);
            uVar.e();
        }
    }
}
