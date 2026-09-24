package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29438a;
    public final m0 f29439b;

    public l0(m0 m0Var, u uVar) {
        this.f29439b = m0Var;
        this.f29438a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29438a;
        if (uVar.getParent() != null) {
            this.f29439b.removeView(uVar);
            uVar.e();
        }
    }
}
