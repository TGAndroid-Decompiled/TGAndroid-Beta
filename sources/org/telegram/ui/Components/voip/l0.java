package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29448a;
    public final m0 f29449b;

    public l0(m0 m0Var, u uVar) {
        this.f29449b = m0Var;
        this.f29448a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29448a;
        if (uVar.getParent() != null) {
            this.f29449b.removeView(uVar);
            uVar.e();
        }
    }
}
