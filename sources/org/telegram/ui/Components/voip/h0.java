package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h0 extends AnimatorListenerAdapter {
    public final t f33551a;
    public final k0 f33552b;

    public h0(k0 k0Var, t tVar) {
        this.f33552b = k0Var;
        this.f33551a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33551a;
        if (tVar.getParent() != null) {
            this.f33552b.removeView(tVar);
            tVar.e();
        }
    }
}
