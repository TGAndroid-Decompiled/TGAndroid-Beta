package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sd0 extends AnimatorListenerAdapter {
    public final int f30225a;
    public final vd0 f30226b;

    public sd0(vd0 vd0Var, int i10) {
        this.f30225a = i10;
        this.f30226b = vd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30225a) {
            case 0:
                this.f30226b.f31226t1 = null;
                return;
            default:
                this.f30226b.f31227u1 = null;
                return;
        }
    }
}
