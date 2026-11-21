package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ui;
public final class qa extends AnimatorListenerAdapter {
    public final ui f44894a;
    public final m7 f44895b;
    public final ra f44896c;

    public qa(ra raVar, ui uiVar, m7 m7Var) {
        this.f44896c = raVar;
        this.f44894a = uiVar;
        this.f44895b = m7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44896c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44896c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44894a != null) {
            org.telegram.messenger.g0.v1(this.f44895b);
        }
    }
}
