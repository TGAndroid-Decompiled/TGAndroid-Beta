package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29390a;
    public final m0 f29391b;

    public l0(m0 m0Var, u uVar) {
        this.f29391b = m0Var;
        this.f29390a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29390a;
        if (uVar.getParent() != null) {
            this.f29391b.removeView(uVar);
            uVar.e();
        }
    }
}
