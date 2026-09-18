package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f27852a;
    public final ue0 f27853b;

    public se0(ue0 ue0Var, int i10) {
        this.f27852a = i10;
        this.f27853b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27852a) {
            case 0:
                this.f27853b.f28377s = null;
                return;
            default:
                this.f27853b.v = null;
                return;
        }
    }
}
