package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k30 extends AnimatorListenerAdapter {
    public final int f36763a;
    public final m30 f36764b;

    public k30(m30 m30Var, int i7) {
        this.f36763a = i7;
        this.f36764b = m30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36763a) {
            case 0:
                m30 m30Var = this.f36764b;
                m30Var.d = null;
                oo ooVar = new oo(this, 22);
                m30Var.f37395e = ooVar;
                org.telegram.messenger.g0.h3(ooVar, m30Var.f37400w);
                return;
            default:
                m30 m30Var2 = this.f36764b;
                m30Var2.setVisibility(4);
                m30Var2.f37394c = null;
                m30Var2.d = null;
                return;
        }
    }
}
