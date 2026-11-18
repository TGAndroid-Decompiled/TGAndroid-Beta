package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.si;
public final class d7 extends AnimatorListenerAdapter {
    public final si f44047a;
    public final m7 f44048b;
    public final e7 f44049c;

    public d7(e7 e7Var, si siVar, m7 m7Var) {
        this.f44049c = e7Var;
        this.f44047a = siVar;
        this.f44048b = m7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44049c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44049c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44047a != null) {
            org.telegram.messenger.g0.v1(this.f44048b);
        }
    }
}
