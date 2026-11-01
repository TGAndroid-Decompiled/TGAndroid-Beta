package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sd0 extends AnimatorListenerAdapter {
    public final int f30271a;
    public final vd0 f30272b;

    public sd0(vd0 vd0Var, int i10) {
        this.f30271a = i10;
        this.f30272b = vd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30271a) {
            case 0:
                this.f30272b.f31261t1 = null;
                return;
            default:
                this.f30272b.f31262u1 = null;
                return;
        }
    }
}
