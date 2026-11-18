package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.si;
public final class qa extends AnimatorListenerAdapter {
    public final si f44854a;
    public final m7 f44855b;
    public final ra f44856c;

    public qa(ra raVar, si siVar, m7 m7Var) {
        this.f44856c = raVar;
        this.f44854a = siVar;
        this.f44855b = m7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44856c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44856c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44854a != null) {
            org.telegram.messenger.g0.v1(this.f44855b);
        }
    }
}
