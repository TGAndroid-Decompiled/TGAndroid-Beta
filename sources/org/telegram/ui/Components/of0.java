package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f29466a;
    public final sf0 f29467b;

    public of0(sf0 sf0Var, int i10) {
        this.f29466a = i10;
        this.f29467b = sf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29466a) {
            case 0:
                this.f29467b.f30777x = null;
                return;
            default:
                this.f29467b.f30778y = null;
                return;
        }
    }
}
