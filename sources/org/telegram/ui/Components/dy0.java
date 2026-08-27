package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class dy0 extends AnimatorListenerAdapter {

    public final int f27873a;

    public final Switch f27874b;

    public dy0(Switch r10, int i10) {
        this.f27873a = i10;
        this.f27874b = r10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27873a) {
            case 0:
                this.f27874b.d = null;
                break;
            default:
                this.f27874b.f26541e = null;
                break;
        }
    }
}
