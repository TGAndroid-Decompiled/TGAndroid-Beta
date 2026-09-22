package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29043a;
    public final m0 f29044b;

    public l0(m0 m0Var, u uVar) {
        this.f29044b = m0Var;
        this.f29043a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29043a;
        if (uVar.getParent() != null) {
            this.f29044b.removeView(uVar);
            uVar.e();
        }
    }
}
