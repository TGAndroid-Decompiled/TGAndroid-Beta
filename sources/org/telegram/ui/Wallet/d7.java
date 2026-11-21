package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ui;
public final class d7 extends AnimatorListenerAdapter {
    public final ui f44087a;
    public final m7 f44088b;
    public final e7 f44089c;

    public d7(e7 e7Var, ui uiVar, m7 m7Var) {
        this.f44089c = e7Var;
        this.f44087a = uiVar;
        this.f44088b = m7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44089c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44089c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44087a != null) {
            org.telegram.messenger.g0.v1(this.f44088b);
        }
    }
}
