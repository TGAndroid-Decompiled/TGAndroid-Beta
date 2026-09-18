package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29026a;
    public final m0 f29027b;

    public l0(m0 m0Var, u uVar) {
        this.f29027b = m0Var;
        this.f29026a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29026a;
        if (uVar.getParent() != null) {
            this.f29027b.removeView(uVar);
            uVar.e();
        }
    }
}
