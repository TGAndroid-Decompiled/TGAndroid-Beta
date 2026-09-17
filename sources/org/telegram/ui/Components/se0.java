package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f30269a;
    public final ue0 f30270b;

    public se0(ue0 ue0Var, int i10) {
        this.f30269a = i10;
        this.f30270b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30269a) {
            case 0:
                this.f30270b.f30876s = null;
                return;
            default:
                this.f30270b.v = null;
                return;
        }
    }
}
