package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class h0 extends AnimatorListenerAdapter {

    public final t f33601a;

    public final k0 f33602b;

    public h0(k0 k0Var, t tVar) {
        this.f33602b = k0Var;
        this.f33601a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33601a;
        if (tVar.getParent() != null) {
            this.f33602b.removeView(tVar);
            tVar.e();
        }
    }
}
