package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lf0 extends AnimatorListenerAdapter {
    public final int f28208a;
    public final nf0 f28209b;

    public lf0(nf0 nf0Var, int i10) {
        this.f28208a = i10;
        this.f28209b = nf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28208a) {
            case 0:
                this.f28209b.f28768s = null;
                return;
            default:
                this.f28209b.v = null;
                return;
        }
    }
}
