package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf0 extends AnimatorListenerAdapter {
    public final int f30567a;
    public final of0 f30568b;

    public mf0(of0 of0Var, int i10) {
        this.f30567a = i10;
        this.f30568b = of0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30567a) {
            case 0:
                this.f30568b.f31288s = null;
                return;
            default:
                this.f30568b.v = null;
                return;
        }
    }
}
