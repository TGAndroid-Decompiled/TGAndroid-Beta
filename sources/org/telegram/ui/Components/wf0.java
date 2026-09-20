package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wf0 extends AnimatorListenerAdapter {
    public final int f30037a;
    public final xf0 f30038b;

    public wf0(xf0 xf0Var, int i10) {
        this.f30037a = i10;
        this.f30038b = xf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30037a) {
            case 0:
                this.f30038b.f30258a.f30517n.setVisibility(8);
                return;
            default:
                this.f30038b.f30258a.h.setVisibility(8);
                return;
        }
    }
}
