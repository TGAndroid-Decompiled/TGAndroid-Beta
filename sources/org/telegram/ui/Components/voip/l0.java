package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final u f29342a;
    public final m0 f29343b;

    public l0(m0 m0Var, u uVar) {
        this.f29343b = m0Var;
        this.f29342a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f29342a;
        if (uVar.getParent() != null) {
            this.f29343b.removeView(uVar);
            uVar.e();
        }
    }
}
