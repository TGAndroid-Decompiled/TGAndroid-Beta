package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29359a;
    public final m0 f29360b;

    public l0(m0 m0Var, u uVar) {
        this.f29360b = m0Var;
        this.f29359a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29359a;
        if (uVar.getParent() != null) {
            this.f29360b.removeView(uVar);
            uVar.e();
        }
    }
}
