package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29411a;
    public final m0 f29412b;

    public l0(m0 m0Var, u uVar) {
        this.f29412b = m0Var;
        this.f29411a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29411a;
        if (uVar.getParent() != null) {
            this.f29412b.removeView(uVar);
            uVar.e();
        }
    }
}
