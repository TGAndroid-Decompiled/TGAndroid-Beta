package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg0 extends AnimatorListenerAdapter {
    public final int f24711a;
    public final og0 f24712b;

    public kg0(og0 og0Var, int i10) {
        this.f24711a = i10;
        this.f24712b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24711a) {
            case 0:
                this.f24712b.F = null;
                return;
            default:
                this.f24712b.u();
                return;
        }
    }
}
