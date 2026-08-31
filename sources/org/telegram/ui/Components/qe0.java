package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe0 extends AnimatorListenerAdapter {
    public final int f30377a;
    public final ue0 f30378b;

    public qe0(ue0 ue0Var, int i10) {
        this.f30377a = i10;
        this.f30378b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30377a) {
            case 0:
                this.f30378b.f31670x = null;
                return;
            default:
                this.f30378b.f31671y = null;
                return;
        }
    }
}
