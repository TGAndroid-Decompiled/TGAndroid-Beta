package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f31961a;
    public final m0 f31962b;

    public l0(m0 m0Var, u uVar) {
        this.f31962b = m0Var;
        this.f31961a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f31961a;
        if (uVar.getParent() != null) {
            this.f31962b.removeView(uVar);
            uVar.e();
        }
    }
}
