package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class of0 extends AnimatorListenerAdapter {

    public final int f31275a;

    public final sf0 f31276b;

    public of0(sf0 sf0Var, int i10) {
        this.f31275a = i10;
        this.f31276b = sf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31275a) {
            case 0:
                this.f31276b.B = null;
                break;
            default:
                this.f31276b.u();
                break;
        }
    }
}
