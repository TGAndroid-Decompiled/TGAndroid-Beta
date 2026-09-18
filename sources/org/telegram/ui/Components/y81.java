package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y81 extends AnimatorListenerAdapter {
    public final int f30148a;
    public final z81 f30149b;

    public y81(z81 z81Var, int i10) {
        this.f30148a = i10;
        this.f30149b = z81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30148a) {
            case 0:
                this.f30149b.f30429y = null;
                return;
            default:
                this.f30149b.f30429y = null;
                return;
        }
    }
}
