package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class id0 extends AnimatorListenerAdapter {
    public final int f36106a;
    public final ld0 f36107b;

    public id0(ld0 ld0Var, int i7) {
        this.f36106a = i7;
        this.f36107b = ld0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36106a) {
            case 0:
                this.f36107b.f37106x1 = null;
                return;
            default:
                this.f36107b.f37107y1 = null;
                return;
        }
    }
}
