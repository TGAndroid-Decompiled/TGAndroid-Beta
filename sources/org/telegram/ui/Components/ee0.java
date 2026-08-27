package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class ee0 extends AnimatorListenerAdapter {

    public final int f28038a;

    public final ge0 f28039b;

    public ee0(ge0 ge0Var, int i10) {
        this.f28038a = i10;
        this.f28039b = ge0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28038a) {
            case 0:
                this.f28039b.f28608s = null;
                break;
            default:
                this.f28039b.v = null;
                break;
        }
    }
}
