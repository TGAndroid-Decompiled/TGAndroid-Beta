package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe0 extends AnimatorListenerAdapter {
    public final int f30393a;
    public final ue0 f30394b;

    public qe0(ue0 ue0Var, int i10) {
        this.f30393a = i10;
        this.f30394b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30393a) {
            case 0:
                this.f30394b.f31624x = null;
                return;
            default:
                this.f30394b.f31625y = null;
                return;
        }
    }
}
