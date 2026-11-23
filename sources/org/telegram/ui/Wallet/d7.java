package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ui;
public final class d7 extends AnimatorListenerAdapter {
    public final ui f44091a;
    public final m7 f44092b;
    public final e7 f44093c;

    public d7(e7 e7Var, ui uiVar, m7 m7Var) {
        this.f44093c = e7Var;
        this.f44091a = uiVar;
        this.f44092b = m7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44093c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44093c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44091a != null) {
            org.telegram.messenger.g0.v1(this.f44092b);
        }
    }
}
