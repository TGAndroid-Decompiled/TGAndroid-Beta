package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f27925a;
    public final ue0 f27926b;

    public se0(ue0 ue0Var, int i10) {
        this.f27925a = i10;
        this.f27926b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27925a) {
            case 0:
                this.f27926b.f28473s = null;
                return;
            default:
                this.f27926b.v = null;
                return;
        }
    }
}
