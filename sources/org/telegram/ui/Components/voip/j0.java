package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f29350a;
    public final m0 f29351b;

    public j0(m0 m0Var, u uVar) {
        this.f29351b = m0Var;
        this.f29350a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29350a;
        if (uVar.getParent() != null) {
            this.f29351b.removeView(uVar);
            uVar.e();
        }
    }
}
