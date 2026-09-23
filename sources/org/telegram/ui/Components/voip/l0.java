package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29017a;
    public final m0 f29018b;

    public l0(m0 m0Var, u uVar) {
        this.f29018b = m0Var;
        this.f29017a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29017a;
        if (uVar.getParent() != null) {
            this.f29018b.removeView(uVar);
            uVar.e();
        }
    }
}
