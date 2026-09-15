package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29046a;
    public final m0 f29047b;

    public l0(m0 m0Var, u uVar) {
        this.f29047b = m0Var;
        this.f29046a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29046a;
        if (uVar.getParent() != null) {
            this.f29047b.removeView(uVar);
            uVar.e();
        }
    }
}
