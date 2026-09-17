package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29023a;
    public final m0 f29024b;

    public l0(m0 m0Var, u uVar) {
        this.f29024b = m0Var;
        this.f29023a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29023a;
        if (uVar.getParent() != null) {
            this.f29024b.removeView(uVar);
            uVar.e();
        }
    }
}
