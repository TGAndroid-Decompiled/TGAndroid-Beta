package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f28972a;
    public final m0 f28973b;

    public j0(m0 m0Var, u uVar) {
        this.f28973b = m0Var;
        this.f28972a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f28972a;
        if (uVar.getParent() != null) {
            this.f28973b.removeView(uVar);
            uVar.e();
        }
    }
}
