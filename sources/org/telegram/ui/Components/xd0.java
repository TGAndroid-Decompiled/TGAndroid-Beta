package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class xd0 extends AnimatorListenerAdapter {

    public final int f34605a;

    public final be0 f34606b;

    public xd0(be0 be0Var, int i10) {
        this.f34605a = i10;
        this.f34606b = be0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34605a) {
            case 0:
                this.f34606b.f27082x = null;
                break;
            default:
                this.f34606b.f27083y = null;
                break;
        }
    }
}
