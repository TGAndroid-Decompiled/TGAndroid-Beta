package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k30 extends AnimatorListenerAdapter {
    public final int f36761a;
    public final m30 f36762b;

    public k30(m30 m30Var, int i7) {
        this.f36761a = i7;
        this.f36762b = m30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36761a) {
            case 0:
                m30 m30Var = this.f36762b;
                m30Var.d = null;
                oo ooVar = new oo(this, 22);
                m30Var.f37397e = ooVar;
                org.telegram.messenger.g0.h3(ooVar, m30Var.f37402w);
                return;
            default:
                m30 m30Var2 = this.f36762b;
                m30Var2.setVisibility(4);
                m30Var2.f37396c = null;
                m30Var2.d = null;
                return;
        }
    }
}
