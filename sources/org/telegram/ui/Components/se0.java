package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se0 extends AnimatorListenerAdapter {
    public final int f27845a;
    public final ue0 f27846b;

    public se0(ue0 ue0Var, int i10) {
        this.f27845a = i10;
        this.f27846b = ue0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27845a) {
            case 0:
                this.f27846b.f28387s = null;
                return;
            default:
                this.f27846b.v = null;
                return;
        }
    }
}
