package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f30296a;
    public final ue0 f30297b;

    public se0(ue0 ue0Var, int i10) {
        this.f30296a = i10;
        this.f30297b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30296a) {
            case 0:
                this.f30297b.f30903s = null;
                return;
            default:
                this.f30297b.v = null;
                return;
        }
    }
}
