package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f27842a;
    public final ue0 f27843b;

    public se0(ue0 ue0Var, int i10) {
        this.f27842a = i10;
        this.f27843b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27842a) {
            case 0:
                this.f27843b.f28384s = null;
                return;
            default:
                this.f27843b.v = null;
                return;
        }
    }
}
