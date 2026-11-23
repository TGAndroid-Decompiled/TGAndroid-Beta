package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k30 extends AnimatorListenerAdapter {
    public final int f36729a;
    public final m30 f36730b;

    public k30(m30 m30Var, int i7) {
        this.f36729a = i7;
        this.f36730b = m30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36729a) {
            case 0:
                m30 m30Var = this.f36730b;
                m30Var.d = null;
                oo ooVar = new oo(this, 22);
                m30Var.f37355e = ooVar;
                org.telegram.messenger.g0.h3(ooVar, m30Var.f37360w);
                return;
            default:
                m30 m30Var2 = this.f36730b;
                m30Var2.setVisibility(4);
                m30Var2.f37354c = null;
                m30Var2.d = null;
                return;
        }
    }
}
