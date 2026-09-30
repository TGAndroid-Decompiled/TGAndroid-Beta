package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ye0 extends AnimatorListenerAdapter {
    public final int f30700a;
    public final cf0 f30701b;

    public ye0(cf0 cf0Var, int i10) {
        this.f30700a = i10;
        this.f30701b = cf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30700a) {
            case 0:
                this.f30701b.f23308x = null;
                return;
            default:
                this.f30701b.f23309y = null;
                return;
        }
    }
}
