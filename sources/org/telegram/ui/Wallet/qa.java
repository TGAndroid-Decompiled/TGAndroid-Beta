package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ui;
public final class qa extends AnimatorListenerAdapter {
    public final ui f44898a;
    public final m7 f44899b;
    public final ra f44900c;

    public qa(ra raVar, ui uiVar, m7 m7Var) {
        this.f44900c = raVar;
        this.f44898a = uiVar;
        this.f44899b = m7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44900c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44900c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44898a != null) {
            org.telegram.messenger.g0.v1(this.f44899b);
        }
    }
}
