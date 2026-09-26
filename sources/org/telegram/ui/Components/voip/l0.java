package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29447a;
    public final m0 f29448b;

    public l0(m0 m0Var, u uVar) {
        this.f29448b = m0Var;
        this.f29447a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29447a;
        if (uVar.getParent() != null) {
            this.f29448b.removeView(uVar);
            uVar.e();
        }
    }
}
