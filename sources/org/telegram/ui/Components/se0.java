package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f27849a;
    public final ue0 f27850b;

    public se0(ue0 ue0Var, int i10) {
        this.f27849a = i10;
        this.f27850b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27849a) {
            case 0:
                this.f27850b.f28374s = null;
                return;
            default:
                this.f27850b.v = null;
                return;
        }
    }
}
