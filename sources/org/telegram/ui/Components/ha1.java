package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ha1 extends AnimatorListenerAdapter {
    public final int f26732a;
    public final ia1 f26733b;

    public ha1(ia1 ia1Var, int i10) {
        this.f26732a = i10;
        this.f26733b = ia1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26732a) {
            case 0:
                this.f26733b.f27118y = null;
                return;
            default:
                this.f26733b.f27118y = null;
                return;
        }
    }
}
